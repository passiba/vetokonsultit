/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.1
 * 
 * Bussi luokka
 * 
 */
package vetokonsultit;

import vetokonsultit.olioharjoitukset.Bussi;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pasi haverinen
 */
public class BussiTest {
    
      Bussi instance;
    public BussiTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        instance= new Bussi();
        instance.nouseeKyytiin(30);
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    /**
     * Test of nouseeKyytiin method, of class Bussi.
     */
    @Test
    public void testNouseeKyytiin() {
     
        int iMaara = 30;
        Bussi instance = new Bussi();
        instance.nouseeKyytiin(iMaara);
      
    }

    /**
     * Test of hyppaaPois method, of class Bussi.
     */
    @Test
    public void testHyppaaPois() {
       
        int maara = 30;
        instance.hyppaaPois(maara);
       
    }

    /**
     * Test of montakoIhmista method, of class Bussi.
     */
    @Test
    public void testMontakoIhmista() {
      
        int expResult = 30;
        int result = instance.montakoIhmista();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of vapaitaIstumapaikkoja method, of class Bussi.
     */
    @Test
    public void testVapaitaIstumapaikkoja() {
       
        int expResult = 20;
        int result = instance.vapaitaIstumapaikkoja();
        assertEquals(expResult, result);
   
      
    }

    /**
     * Test of vapaitaPaikkoja method, of class Bussi.
     */
    @Test
    public void testVapaitaPaikkoja() {
       
        int expResult = 20;
        int result = instance.vapaitaPaikkoja();
        assertEquals(expResult, result);
       
    }
}
