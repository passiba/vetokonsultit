/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.3
 * 
 * Yksio luokka
 * 
 */
package vetokonsultit.olioharjoitukset;

/**
 *
 * @author pasi haverinen
 */
public class Yksio extends Asunto  implements AsunnonArvoPalvelu{

    public Yksio(String sijainti, int kerros, int huoneita) {
        super(sijainti, kerros, 1);
    }

   
    @Override
    public double laskeAsunnonArvo( String sijainti) {
        
        double hinta=0.0;
        
        if(sijainti.equals("Helsinki") || sijainti.equals("Espoo"))
        {
            hinta=120000.00;
        }else
        {
            hinta=10000;
        }
        return hinta;
        
    }
    
   
    
    
    
    
}
