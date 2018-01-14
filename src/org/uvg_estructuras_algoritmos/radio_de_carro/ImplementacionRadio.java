package org.uvg_estructuras_algoritmos.radio_de_carro;

/**
 * Esta clase implementa la interfaz RadioI. Es utilizada
 * por la clase que implementa la interfaz grafica para
 * controlar y simular un radio de carro.
 * 
 * @author sevic69
 * @author fernando_figueroa
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
        // el radio esta en modo AM
        if(isAmSintonized)
        {
            
        }
        // el radio esta en modo FM
        else
        {
            
        }
        return "";
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Enciende la radio. Si la radio ya estaba encendida,
     * este metodo no hace nada.
     * @return el valor booleano True, indicando que la radio esta
     * encendida.
     */
    @Override
    public boolean prender() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @return
     */
    @Override
    public String cambioFrecuencia() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param frec
     * @param pos
     */
    @Override
    public void guardarFrecAm(int frec, int pos) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param frec
     * @param pos
     */
    @Override
    public void guardarFrecFm(float frec, int pos) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @return
     */
    @Override
    public String mostrarEstacion()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
