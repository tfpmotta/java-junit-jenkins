/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author juan_
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

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int num1 = 3;
        int num2 = 2;
        Calculadora instance = new Calculadora();
        int expResult = 5;
        int result = instance.somar(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int num1 = 5;
        int num2 = 5;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.subtrair(num1, num2);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double num1 = 4.0;
        double num2 = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.multiplicar(num1, num2);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
