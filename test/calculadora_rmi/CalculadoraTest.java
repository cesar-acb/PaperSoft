/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_rmi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author César
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
     * Test of soma method, of class Calculadora.
     */
    @Test
    public void testSoma() throws Exception {
        System.out.println("soma");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.soma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtrai method, of class Calculadora.
     */
    @Test
    public void testSubtrai() throws Exception {
        System.out.println("subtrai");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.subtrai(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
