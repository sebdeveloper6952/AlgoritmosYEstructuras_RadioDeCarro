package org.uvg_estructuras_algoritmos.radio_de_carro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Arenas
 */
public class ImplementacionRadioTest {
    
    public ImplementacionRadioTest() {
    }

    /**
     * Prueba de metodo para verfiicar que la radio avanze de
     * estacion y actualice la estacion actual.
     */
    @Test
    public void testFrecAdelante() 
    {
        System.out.println("frecAdelante");
        ImplementacionRadio instance = new ImplementacionRadio();
        String result = instance.frecAdelante();
        String expResult = instance.mostrarEstacion();
        assertEquals(expResult, result);
    }

    /**
     * Prueba de metodo para verificar que la radio retroceda
     * de estacion y actualice la estacion actual.
     */
    @Test
    public void testFrecAtras() {
        System.out.println("frecAtras");
        ImplementacionRadio instance = new ImplementacionRadio();
        String result = instance.frecAtras();
        String expResult = instance.mostrarEstacion();
        assertEquals(expResult, result);
    }

    /**
     * Verifica que el radio se encienda correctamente.
     */
    @Test
    public void testPrender() {
        System.out.println("prender");
        ImplementacionRadio instance = new ImplementacionRadio();
        assertTrue(instance.prender());
    }
    
    /**
     * Test que falla a proposito para verficar que la radio
     * empieza apagada.
     */
    @Test
    public void testFallarPrender()
    {
        System.out.println("fallarPrender");
        ImplementacionRadio instance = new ImplementacionRadio();
        assertTrue(instance.estaPrendido());
    }
        

    /**
     * Verifica que el radio se apague correctamente.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        ImplementacionRadio instance = new ImplementacionRadio();
        boolean expResult = false;
        boolean result = instance.apagar();
        assertEquals(expResult, result);
    }

    /**
     * Metodo que prueba que el radio cambie de estado (AM o FM).
     * El radio inicialmente esta en FM, asi que al cambiar de
     * estado 1 vez deberia ser AM.
     */
    @Test
    public void testCambioFrecuencia() {
        System.out.println("cambioFrecuencia");
        ImplementacionRadio instance = new ImplementacionRadio();
        instance.prender();
        String expResult = "AM";
        String result = instance.cambioFrecuencia();
        assertEquals(expResult, result);
    }
    
    /**
     * Verifica que la radio guarde la estacion adecuada en la
     * posicion adecuada. Se verifica obteniendo la estacion
     * nuevamente de la memoria de la radio.
     */
    @Test
    public void testGuardarEstacion()
    {
        System.out.println("guardarEstacion");
        ImplementacionRadio instance = new ImplementacionRadio();
        instance.prender();
        String s = instance.frecAdelante();
        instance.guardarEstacionActual(0);
        assertEquals(s, instance.obtenerEstacion(0));
    }


    /**
     * Comprueba que la radio muestra la estacion adecuada.
     */
    @Test
    public void testMostrarEstacion() {
        System.out.println("mostrarEstacion");
        ImplementacionRadio instance = new ImplementacionRadio();
        instance.prender();
        String expResult ="87.9";
        String result = instance.mostrarEstacion();
        assertEquals(expResult, result);
    }
    
}
