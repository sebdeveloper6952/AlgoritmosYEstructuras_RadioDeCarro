/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uvg_estructuras_algoritmos.radio_de_carro;

/**
 *
 * @author sevic69
 */
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
