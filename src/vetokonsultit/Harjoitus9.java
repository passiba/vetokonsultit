/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.9
 */
package vetokonsultit;

/**
 *
 * @author pasi haverinen
 */
public class Harjoitus9 {
    
  
    /**
     * 
     * @param sMerkkijono
     * @param sEtsi
     * @param sKorvaa
     * @return SMerkkijono,sisaltaen korvatut merkkijonon
     */
     public static String replaceString(String sMerkkijono, String sEtsi, String sKorvaa)
     {
         sMerkkijono=sMerkkijono.replace(sEtsi,sKorvaa);
         
         return sMerkkijono;
     }
    
}
