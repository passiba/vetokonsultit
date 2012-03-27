/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetokonsultit;

import java.util.ArrayList;
import java.util.Collection;
import vetokonsultit.olioharjoitukset.OpiskelijaEiLoytynytException;
import vetokonsultit.olioharjoitukset.Opiskelija;
import vetokonsultit.olioharjoitukset.OpiskelijaJoukko;
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
public class OpiskelijaJoukkoTest {
    
      Opiskelija opiskelija1 = null,opiskelija2=null;
      OpiskelijaJoukko instance =null;
    
    public OpiskelijaJoukkoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        opiskelija1 = new Opiskelija("Pentti Paavonen", "datanomi ict-linja");
        opiskelija1.setOpiskelijanro(1);

        opiskelija2=new Opiskelija("Tiina Testaaja", "kotitalouslinja");
        opiskelija2.setOpiskelijanro(2);
        instance= new OpiskelijaJoukko();
        instance.lisaaOpiskelija(opiskelija1);
        instance.lisaaOpiskelija(opiskelija2);
    }
    
    @After
    public void tearDown() {
        opiskelija1=null;
        opiskelija2=null;
        instance=null;
    }

    /**
     * Test of lisaaOpiskelija method, of class OpiskelijaJoukko.
     */
    @Test
    public void testLisaaOpiskelija() {
       
        
        instance.lisaaOpiskelija(new Opiskelija("Essi Essuliini", "merkonomilinja"));
    }

    /**
     * Test of kaikkiOpiskelijat method, of class OpiskelijaJoukko.
     */
    @Test
    public void testKaikkiOpiskelijat() {
         Collection <Opiskelija> expResult = new ArrayList<Opiskelija>();
         expResult.add(opiskelija1);
         expResult.add(opiskelija2);
        Collection <Opiskelija> result = instance.kaikkiOpiskelijat();
        assertEquals(expResult.size(), result.size());
        
        
    }

    /**
     * Test of annaOpiskelija method, of class OpiskelijaJoukko.
     */
    @Test
    public void testAnnaOpiskelija() throws Exception {
      
        long oNro = 1;
        
        Opiskelija expResult =opiskelija1;
        Opiskelija result = instance.annaOpiskelija(oNro);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valmistui method, of class OpiskelijaJoukko.
     */
    @Test
    public void testValmistui() throws Exception {
        
        long oNro = 1;
        instance.valmistui(1);
    
    }

    /**
     * Test of tulostaKaikkienOpiskelijoidenTiedot method, of class OpiskelijaJoukko.
     */
    @Test
    public void testTulostaKaikkienOpiskelijoidenTiedot() {
      
        instance.tulostaKaikkienOpiskelijoidenTiedot();
       
    }

    /**
     * Test of getOpiskelijat method, of class OpiskelijaJoukko.Testin pitäisi odottaa OpiskelijaEiLoytynytException-Poikkeuksen heittamista
     * kun opiskelijaa ei loydeta
     */
    @Test(expected=OpiskelijaEiLoytynytException.class)
    public void testAnnaOpiskelijaFail() throws OpiskelijaEiLoytynytException {
       long oNro = 4;
        
        Opiskelija result = instance.annaOpiskelija(oNro);
       
    }
}
