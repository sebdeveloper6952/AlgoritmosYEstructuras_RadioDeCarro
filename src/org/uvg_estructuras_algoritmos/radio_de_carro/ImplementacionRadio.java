package org.uvg_estructuras_algoritmos.radio_de_carro;

/**
 * Universidad Del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * 
 * Sebastián Arriola - Carnet no. 11463
 * Jose Andrés Arenas - Carnet no. 14470
 * Fernando Figueroa - Carnet no. 14175
 * 
 * 
 ****************** Esta clase implementa la interfaz RadioI. Es utilizada
 * **************** por la clase que implementa la interfaz grafica para
 ****************** controlar y simular un radio de carro.
 * 
 */

public class ImplementacionRadio implements RadioI
{

    /**
     * Limite inferior del rango AM.
     */
    protected final int AM_MIN = 530;

    /**
     * Limite superior del rango AM.
     */
    protected final int AM_MAX = 1610;

    /**
     * Limite inferior del rango FM.
     */
    protected final float FM_MIN = 87.9f;

    /**
     * Limite superior del rango FM.
     */
    protected final float FM_MAX = 107.9f;

    /**
     * Espacio entre cada canal de AM.
     */
    protected final int AM_STEP = 10;

    /**
     * Espacio entre cada canal de FM.
     */
    protected final float FM_STEP = 0.2f;
    
    /**
     * Mensaje de error que se muestra si se intenta realizar
     * una operacion cuando el radio esta apagado.
     */
    protected final String ERROR_MESSAGE = "EL RADIO ESTA APAGADO.";

    /**
     * Se utiliza para saber si el radio esta encendido.
     * Si es true, el radio esta encendido y si es false,
     * el radio esta apagado.
     */
    protected boolean isOn;

    /**
     * Se utiliza para saber si el radio esta en modo AM
     * o FM. Si es true, el radio esta en AM, si es false
     * el radio esta en FM.
     */
    protected boolean isAmSintonized;

    /**
     * Se utiliza para guardar la estacion actual de AM.
     * Si el usuario cambia a FM y luego a AM, esta variable
     * podra restaurar la ultima estacion AM que el usuario
     * estaba sintonizando.
     */
    protected int curAmStation;

    /**
     * Se utiliza para guardar la estacion actual de FM.
     * Si el usuario cambia a AM y luego a FM, esta variable
     * podra restaurar la ultima estacion FM que el usuario
     * estaba sintonizando.
     */
    protected float curFmStation;
    
    /**
     * Arreglo con capacidad 12, el cual guarda las estaciones
     * AM definidas por el usuario.
     */
    protected int memoriaAM[];
    
    /**
     * Arreglo con capacidad 12, el cual guarda las estaciones
     * FM definidas por el usuario.
     */
    protected float memoriaFM[];
    
    /**
     * Crea una nueva instancia de ImplementacionRadio con
     * el estado inicial siguiente:
     * - radio apagado
     * - radio sintonizando FM
     * - memoria de botones apuntando al valor minimo del 
     *   rango (AM o FM)
     */
    public ImplementacionRadio()
    {
        curAmStation = AM_MIN;
        curFmStation = FM_MIN;
        isOn = false;
        isAmSintonized = false;
        memoriaAM = new int[12];
        memoriaFM = new float[12];
        // llenar la memoria con valores validos
        for(int i = 0; i < 12; i++)
        {
            memoriaAM[i] = AM_MIN;
            memoriaFM[i] = FM_MIN;
        }
    }
    
    /**
     * Incrementa la estacion actual, por una cantidad
     * predefinida. Si el radio esta en AM, esta cantidad es 10.
     * Si el radio esta en FM, esta cantidad es 0.2. Si el
     * nuevo valor se encuentra fuera del rango del modo actual
     * (AM o FM), este metodo se encarga de volver a un valor
     * correcto.
     * @return La nueva estacion sintonizada.
     */
    @Override
    public String frecAdelante() 
    {
        if(isOn)
        {
            // el radio esta en modo AM
            if(isAmSintonized)
            {
                curAmStation += AM_STEP;
                // si se paso del rango, se regresa al valor minimo AM
                if(curAmStation > AM_MAX)
                    curAmStation = AM_MIN;
                return String.valueOf(curAmStation);
            }
            // el radio esta en modo FM
            else
            {
                curFmStation += FM_STEP;
                // si se paso del rango, se regresa al valor minimo AM
                if(curFmStation > FM_MAX)
                    curFmStation = FM_MIN;
                return String.format("%.1f", curFmStation);
            }
        }
        return ERROR_MESSAGE;
    }

    /**
     * Disminuye la estacion actual, por una cantidad
     * predefinida. Si el radio esta en AM, esta cantidad
     * es 10. Si el radio esta en FM, esta cantidad es 0.2.
     * Si el nuevo valor se encuentra fuera del rango del
     * modo actual (AM o FM), este metodo se encarga de
     * volver a un valor correcto.
     * @return La nueva estacion sintonizada.
     */
    @Override
    public String frecAtras() 
    {
        if(isOn)
        {
            // el radio esta en modo AM
            if(isAmSintonized)
            {
                curAmStation -= AM_STEP;
                // si se paso del rango, se regresa al valor minimo AM
                if(curAmStation < AM_MIN)
                    curAmStation = AM_MAX;
                return String.valueOf(curAmStation);
            }
            // el radio esta en modo FM
            else
            {
                curFmStation -= FM_STEP;
                // si se paso del rango, se regresa al valor minimo AM
                if(curFmStation < FM_MIN)
                    curFmStation = FM_MAX;
                return String.format("%.1f", curFmStation);
            }
        }
        return ERROR_MESSAGE;
    }

    /**
     * Prender la radio. Si la radio ya estaba prender,
     * este metodo no hace nada.
     * @return el valor booleano True, indicando que la radio esta
     * encendida.
     */
    @Override
    public boolean prender() 
    {
        if(!isOn) isOn = !isOn;
        return isOn;
    }

    /**
     * Apaga la radio. Si la radio ya estaba apagada,
     * este metodo no hace nada.
     * @return el valor booleano False, indicando que la radio esta
     * apagada.
     */
    @Override
    public boolean apagar() 
    {
        if(isOn) isOn = !isOn;
        return isOn;
    }

    /**
     * Cambia entre modo  AM y FM. Este metodo funciona como
     * un tipo "Toggle", si el modo actual es AM, el nuevo modo
     * sera FM, y vice versa.
     * @return el nuevo modo como cadena de caracteres: AM o FM
     */
    @Override
    public String cambioFrecuencia() 
    {
        if(isOn)
        {
            isAmSintonized = !isAmSintonized;
            String returnMsg = obtenerEstado();
            return returnMsg;
        }
        return ERROR_MESSAGE;
    }

    /**
     * Muestra la estacion actual que el radio esta sintonizando, 
     * tomando en cuenta el estado del radio (AM o FM);
     * @return la estacion actual como String.
     */
    @Override
    public String mostrarEstacion()
    {
        if(isOn)
        {
            if(isAmSintonized) return String.valueOf(curAmStation);
            return String.format("%.1f", curFmStation);
        }
        return ERROR_MESSAGE;
    }
    
    /**
     * Guarda la estacion actual en la memoria del radio. Si el radio
     * esta en AM, la estacion actual de AM se guarda en la memoria
     * para AM y lo mismo pasa si el radio esta en FM.
     * @param pos La posicion de memoria en la que se desea guardar
     * la estacion actual.
     */
    @Override
    public void guardarEstacionActual(int pos) 
    {
        if(isOn)
        {
            if(pos > -1 && pos < 12)
            {
                if(isAmSintonized)
                {
                    memoriaAM[pos] = curAmStation;
                }
                else
                {
                    memoriaFM[pos] = curFmStation;
                }
            }
        }
    }

    /**
     * Metodo que verifica en que banda esta sintonizado el radio, para despues
     * guardar el valor de la estacion en la respectiva memoria. 
     * @param pos posicion de la memoria donde se guardará el valor.
     * @return La estacion de radio como String, o devuelve un mensaje de error
     * si la posicion de memoria es invalida.
     */
    @Override
    public String obtenerEstacion(int pos) 
    {
        if(isOn)
        {
            if(pos > -1 && pos < 12)
            {
                if(isAmSintonized)
                {
                    curAmStation = memoriaAM[pos];
                    return String.valueOf(curAmStation);
                }
                else
                {
                    curFmStation = memoriaFM[pos];
                    return String.format("%.1f", curFmStation);
                }
            }
            return "Posicion de memoria invalida.";
        }
        return ERROR_MESSAGE;
    }

    /**
     * Metodo que devuelve el estado del Radio
     * @return true si el radio esta prendido, false si esta
     * apagado.
     */
    @Override
    public boolean estaPrendido() 
    {
        return isOn;
    }

    /**
     * Obtiene el estado actual del radio, AM o FM.
     * @return Regresa el nuevo estado del radio. ("AM" o "FM")
     */
    @Override
    public String obtenerEstado() 
    {
        if(isOn)
        {
            if(isAmSintonized) return "AM";
            else return "FM";
        }
        else return "EL RADIO ESTA APAGADO.";
    }
}
