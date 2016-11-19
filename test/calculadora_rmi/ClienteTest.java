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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of main method, of class Cliente.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Cliente.main(args);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("\nTeste de Inclusao de Cliente Executado com sucesso!\n");
    }
}
