/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetokonsultit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miesryhma
 */
public class Tehtava2Test {
    
    public Tehtava2Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     /**
     * Test of kertoLasku method, of class Tehtava2.
     */
    @Test
    public void testKertoLasku() {
        System.out.println("kertoLasku");
        int a = 12;
        int b = 32;
        Tehtava2 instance = new Tehtava2();
        int expResult = 384;
        int result = instance.kertoLasku(a, b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of jakoLasku method, of class Tehtava2.
     */
    @Test
    public void testJakoLasku() {
        System.out.println("jakoLasku");
        int a = 12;
        int b = 32;
        Tehtava2 instance = new Tehtava2();
        double expResult = 0.375;
        double result = instance.jakoLasku(a, b);
        assertEquals(expResult, result, 0.0);
        
       
    }

    /**
     * Test of laskeArvot method, of class Tehtava2.
     */
    @Test
    public void testLaskeArvot() {
        System.out.println("laskeArvot");
        int a = 12;
        int b = 32;
        int c=-23;
        Tehtava2 instance = new Tehtava2();
        double expResult = -8.625;
        double result = instance.laskeArvot(a, b, c);
        assertEquals(expResult, result, 0.0);
        
    }

    
 
}
