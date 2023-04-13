/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam
 */
public class CalculadoraSimpleIT {
    
    public CalculadoraSimpleIT() {
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
     * Test of suma method, of class CalculadoraSimple.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = CalculadoraSimple.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class CalculadoraSimple.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = CalculadoraSimple.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class CalculadoraSimple.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = CalculadoraSimple.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class CalculadoraSimple.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = CalculadoraSimple.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
