/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.2
 * 
 * OpiskelijaEiLoytynytException luokka
 * 
 * poikkeus heitetaan kun haluttua opiskelijaa ei loydy annetulla opiskelijanumerolla
 * 
 */
package vetokonsultit.olioharjoitukset;

/**
 *
 * @author pasi haverinen
 */
public class OpiskelijaEiLoytynytException extends Exception{

    public OpiskelijaEiLoytynytException(String message) {
        super(message);
    }

    
    
    @Override
    public String getMessage() {
        return "Etsittya opiskelijaa ei loytynyt";
    }
    
    
    
}
