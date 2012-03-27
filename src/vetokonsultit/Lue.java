/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.4
 * 
 * Lukee tietyn kirjaimen,kokonaisluvun,liukuluvun näppimistöltä
 * 
 */
package vetokonsultit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pasi haverinen
 */
public class Lue {

    private static InputStreamReader  isr = new InputStreamReader(System.in);
    private static BufferedReader input = input = new BufferedReader(isr);

    /**
     * Konstruktori,alustaa konsolin lukuun käytetyt muuttujat
     * 
     */
    public Lue() {
      // this.initializeVariables();

    }
    
    /*
     * Alustaa staattiset muuttujat
     */
    private static void initializeVariables()
    {
        try {
            isr = new InputStreamReader(System.in,"UTF-8");
            input = input = new BufferedReader(isr);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Lue.class.getName()).log(Level.SEVERE, ex.getLocalizedMessage());
        }
    }

     /**
     * Lukee desimaaliluvun näppäimistöltä
     * @return luku 
     * @throws NumberFormatException
     */
    public static double dluku() {
         double d_int=0.0;
        try {
             d_int=input.read();
            char c= (char)d_int;
        //tarkistetaan onko kyseessä numero
        if(!Character.isDigit(c));
        {
             Logger.getLogger(Lue.class.getName()).log(Level.SEVERE, "Annettu merkki: "+c+ " ei ollut numero");
             throw new NumberFormatException("Annettu merkki: "+c+ " ei ollut numero");
        }
        } catch (IOException ex) {
            Logger.getLogger(Lue.class.getName()).log(Level.SEVERE, ex.getLocalizedMessage());
        }
      
        return d_int;
    }

    /**
     * Lukee kokonaisluvun näppäimistöltä. Käyttäjä ilmoittaa kokonaisluvun loppumisen painamalla Enter:iä. 
     * Ohjelma tulostaa virheilmoituksen, jos annettu luku ei ollut kokonaisluku, esim. siinä oli kirjaimia
     * @return luku 
     * @throws NumberFormatException
     */
    public static int kluku() throws NumberFormatException {
        
        
        int c_int=0;
        try {
            c_int=input.read();
            char c= (char)c_int;
        //tarkistetaan onko kyseessä numero
        if(!Character.isDigit(c));
        {
             Logger.getLogger(Lue.class.getName()).log(Level.SEVERE, "Annettu merkki: "+c+ " ei ollut numero");
             throw new NumberFormatException("Annettu merkki: "+c+ " ei ollut numero");
        }
        } catch (IOException ex) {
            Logger.getLogger(Lue.class.getName()).log(Level.SEVERE, ex.getLocalizedMessage());
        }
      
        return c_int;

    }

    /**
     * Lukee yhden merkin näppäimistöltä.
     * @return 
     */
    public static char merkki() {
        int c_int=0;
        try {
            c_int=input.read();
        } catch (IOException ex) {
            Logger.getLogger(Lue.class.getName()).log(Level.SEVERE, ex.getLocalizedMessage());
        }
        return (char)c_int;

    }

    /**
     * Lukee rivin näppäimistöltä. Siis merkkejä Enter:in painallukseen asti.
     * 
     * @return luettu rivi näppäimistöltä
     */
    public static java.lang.String rivi() {
        String line = null;
        try {
            line = input.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Lue.class.getName()).log(Level.SEVERE, ex.getLocalizedMessage());
        }
        return line;
    }

    /**
     * sulkee aukaistut Inputstream muuttujat
     * @throws Throwable 
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        try {
            if (input != null) {
                input.close();
            }
            if (isr != null) {

                isr.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Lue.class.getName()).log(Level.SEVERE, ex.getLocalizedMessage());
        }
    }
}
