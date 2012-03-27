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
public class Harjoitus9Test {
    
    
    public Harjoitus9Test() {
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
     * Test of replaceString method, of class Harjoitus9.
     */
    @Test
    public void testReplaceString() {
 
        String sMerkkijono = "Huomenna on kevatpaiva";
        String sEtsi = "kevat";
        String sKorvaa = "syys";
        String expResult = "Huomenna on syyspaiva";
        String result = Harjoitus9.replaceString(sMerkkijono, sEtsi, sKorvaa);
        assertEquals(expResult, result);
       
    }
}
