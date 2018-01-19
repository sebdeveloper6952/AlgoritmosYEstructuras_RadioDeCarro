/**
 * Universidad Del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * 
**/

package org.uvg_estructuras_algoritmos.radio_de_carro;


public interface RadioI 
{
    public String frecAdelante();
    public String frecAtras();
    public boolean prender();
    public boolean apagar();
    public String cambioFrecuencia();
    public void guardarEstacionActual(int pos);
    public String obtenerEstacion(int pos);
    public String mostrarEstacion();
    public boolean estaPrendido();
    public String obtenerEstado();
}
