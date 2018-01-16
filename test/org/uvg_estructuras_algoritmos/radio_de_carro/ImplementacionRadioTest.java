/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of frecAdelante method, of class ImplementacionRadio.
     */
    @Test
    public void testFrecAdelante() {
        System.out.println("frecAdelante");
        ImplementacionRadio instance = new ImplementacionRadio();
        String result = instance.frecAdelante();
        String expResult = instance.mostrarEstacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of frecAtras method, of class ImplementacionRadio.
     */
    @Test
    public void testFrecAtras() {
        System.out.println("frecAtras");
        ImplementacionRadio instance = new ImplementacionRadio();
        String result = instance.frecAtras();
        String expResult = instance.mostrarEstacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of prender method, of class ImplementacionRadio.
     */
    @Test
    public void testPrender() {
        System.out.println("prender");
        ImplementacionRadio instance = new ImplementacionRadio();
        assertTrue(instance.prender());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class ImplementacionRadio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        ImplementacionRadio instance = new ImplementacionRadio();
        boolean expResult = false;
        boolean result = instance.apagar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cambioFrecuencia method, of class ImplementacionRadio.
     */
    @Test
    public void testCambioFrecuencia() {
        System.out.println("cambioFrecuencia");
        ImplementacionRadio instance = new ImplementacionRadio();
        String expResult = "AM";
        String result = instance.cambioFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardarFrecAm method, of class ImplementacionRadio.
     */
    @Test
    public void testGuardarFrecAm() {
        System.out.println("guardarFrecAm");
        int frec = 0;
        int pos = 0;
        ImplementacionRadio instance = new ImplementacionRadio();
        instance.guardarFrecAm(frec, pos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardarFrecFm method, of class ImplementacionRadio.
     */
    @Test
    public void testGuardarFrecFm() {
        System.out.println("guardarFrecFm");
        float frec = 0.0F;
        int pos = 0;
        ImplementacionRadio instance = new ImplementacionRadio();
        instance.guardarFrecFm(frec, pos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarEstacion method, of class ImplementacionRadio.
     */
    @Test
    public void testMostrarEstacion() {
        System.out.println("mostrarEstacion");
        ImplementacionRadio instance = new ImplementacionRadio();
        instance.prender();
        String expResult ="87.9";
        String result = instance.mostrarEstacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
