/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.3
 */
package vetokonsultit;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * ohjelma lukee konsolilta annetun syotteen ja lisaa siihen
 * puu etuliitteen
 * @author pasi haverinen
 */
public class Tehtava3 {
    
    public static String PUU="puu";
    
    /*
     * Lukee annetun syöttteen konsolilta ja lisää siihen puu etuliitteen
     * 
     */
    private static String LueRivi( BufferedReader input) throws IOException
    {  
            return input.readLine();
    }
    /*
     * Lisää annettuun syotteeseen puu etuliiitteen
     * 
     * 
     */
    private static String LisaaEtuLiite(String rivi)
    {
        StringBuffer buffer=new StringBuffer(PUU);
        buffer.append(rivi);
        return buffer.toString();
        
    }
    public static void main(String[] args)  
    {
        
            String rivi;  // sisaltaa syotetyn rivin
            
            // lue ja printaa rivi whileloopin sisalla 
            // lopeta   EOF: control-Z (Windows) tai control-D 
            while ((rivi =  Lue.rivi() )!= null) {
                
                String lisattyEtuliite=LisaaEtuLiite(rivi);
                System.out.println(lisattyEtuliite);   // prosessoi rivi
            }

    }
}
