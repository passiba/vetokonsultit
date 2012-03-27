/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.6
 */
package vetokonsultit;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author pasi haverinen
 */
public class Harjoitus6 {
    
    
    
    
    
     /*
     * Pyytää kayttajaa syottamaan tietyn ajan määreet
     * palauttaa kokonaisluvun
     * 
     * 
     */
    private static int AnnaAikaMaare(String aikayksikko,int min,int max) {
        String rivi;
        int luku = 0;
         for (boolean jatketaan=true;jatketaan;) {
            try {
                System.out.print("Anna "+aikayksikko +" ");
                rivi = Lue.rivi();
                if (rivi != null) {
                    luku = Integer.parseInt(rivi);
                }
                //tarkistetaan onko annettu luku min ja max arvojen valissa
                if((luku>min || luku==min) && (luku<=max))
                {
                     jatketaan=false;
                }

            } catch (NumberFormatException ne) {
            }
        }
        return luku;

    }
    
    
      public static void main(String[] args) {

     //     Calendar today = new GregorianCalendar();
          Calendar now = Calendar.getInstance();
         
         // now.set(2011, month, date, hourOfDay, minute);
          int tunnit=0,minuutit=0,kestoMinuutit=0;
          Scanner input = new Scanner(System.in);
          
         
          System.out.print("Anna kellonaika ");
          tunnit=Harjoitus6.AnnaAikaMaare("Tunnit",1,24);
          minuutit=Harjoitus6.AnnaAikaMaare("Minuutit",1,60);
          
          System.out.print("Anna kesto? ");
          kestoMinuutit = input.nextInt();
          
          now.set(java.util.Calendar.HOUR, tunnit);
          now.set(java.util.Calendar.MINUTE, minuutit);
          
          System.out.println("Aika on "+now.get(java.util.Calendar.HOUR)+":"+now.get(java.util.Calendar.MINUTE));
          
          now.add(java.util.Calendar.MINUTE, kestoMinuutit);
         
          
          System.out.println("Aika on  " + kestoMinuutit+ " jälkeen:  "+now.get(java.util.Calendar.HOUR)+":"+now.get(java.util.Calendar.MINUTE));

    }
    
}
