/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leobusta
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double num1 = 4.0;
        double num2 = -5.0;
        Calculadora instance = new Calculadora();
        double expResult = -1.0;
        double result = instance.suma(num1, num2);
        assertEquals("La suma falla ",expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double num1 = 0.0;
        double num2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double num1 = 0.0;
        double num2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test (expected=AssertionError.class)
    public void testDivision() {
        System.out.println("division");
        double num1 = 1.0;
        double num2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.division(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        Calculadora.main();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
