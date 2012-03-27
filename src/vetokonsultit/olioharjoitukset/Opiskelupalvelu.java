/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.2
 * 
 * opiskelijapalvelu interface
 * 
 */
package vetokonsultit.olioharjoitukset;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author pasi haverinen
 */
public interface Opiskelupalvelu {
    
    
    /**
     * lisaa  opiskelijan opiskelijaryhmaan
     * @param opiskelija 
     */
    public abstract void lisaaOpiskelija( Opiskelija opiskelija );
    
    /**
     * Palauttaa kaikki joukkoon kuuluvat opiskelijat
     * @return 
     */
    public abstract Collection<Opiskelija> kaikkiOpiskelijat();
    
     /**
     * Palauttaa opiskelijan numeron perusteella 
     * 
     * @param oNro oopiskelijan numero
     * @return palauttaa haetun opiskelijanTiedot
     * @throws OpiskelijaEiLoytynytException heittaa poikkeuksen jos etsittya opiskelijaa ei loytynyt
     */
     
     public abstract Opiskelija annaOpiskelija(long  oNro ) throws OpiskelijaEiLoytynytException;
    
     /**
      * Poistaa valmistuneen opiskelijan annetun opiskelija numeron perusteella
      * @param oNro opiskelijanumero
      * @throws OpiskelijaEiLoytynytException heittaa poikkeuksen jos etsittya opiskelijaa ei loytyny
      */
     public abstract void valmistui( long oNro )throws OpiskelijaEiLoytynytException;;
     
     
     /** listaa kaikki opiskelijat ja heidän numeronsa
      * 
      */
     public abstract void tulostaKaikkienOpiskelijoidenTiedot();
    
}
