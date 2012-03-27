/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.7
 */
package vetokonsultit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pasi haverinen
 */
public class Harjoitus7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<String>();

        //lue yksi sana kerrallaan
        System.out.println("Kirjoita Sanat    (D lopeettaaksesi ja paina Enter)");


        String rivi = "";

        //lue konsolitla kirjaimia ja lisää arraylistaan
        for (rivi = Lue.rivi(); !rivi.trim().equals("D");) {
            System.out.print("Anna sana ");
            rivi = Lue.rivi();
            //ei lisätä lopetus merkkiä
            if (!rivi.trim().equals("D")) {
                sanat.add(rivi);
            }
        }

        //...järjestä sanat
        Collections.sort(sanat);

        //tulosta sanat
        System.out.println("\n\nSanat sortattuna\n");
        for (String sana : sanat) {
            System.out.println(sana);
        }


    }
}
