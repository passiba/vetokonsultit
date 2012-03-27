/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.8
 */
package vetokonsultit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pasi haverinen
 */
public class Harjoitus8 {

    private static final double NUMEROIDEN_LKM = 5;

    private static ArrayList<Integer> lisaaLuku(ArrayList<Integer> numerot, boolean onkoAlustettu) {


        int luku = 0;
        String rivi;
        //poista ensimmainen luku
        if (onkoAlustettu && !numerot.isEmpty() && numerot.size() == NUMEROIDEN_LKM) {
            numerot.remove(0);
        }

        for (boolean jatketaan=true;jatketaan;) {
            try {
                System.out.print("Anna luku  ");
                rivi = Lue.rivi();
                if (rivi != null) {
                    luku = Integer.parseInt(rivi);
                    numerot.add(luku);
                }
                jatketaan = false;;

            } catch (NumberFormatException ne) {
            }
        }
        return numerot;

    }

    private static double laskeKeskiArvo(  ArrayList<Integer> numerot,double vanhaNumero) {
        
        double summa=0.0;
        
         for (Integer luku:numerot) {
            summa = +luku;
        }
        summa -= vanhaNumero;
        return summa / NUMEROIDEN_LKM;
    }

    public static void main(String[] args) {


        ArrayList<Integer> numerot = new ArrayList<Integer>();
        double vanhaNumero=0.0;
        double ka = 0.0;
        boolean onkoNumerotAlustettu = false;
        //lisataan 5 numeroa
        for (int i = 0; i <= NUMEROIDEN_LKM - 1; i++) {
            numerot = Harjoitus8.lisaaLuku(numerot, onkoNumerotAlustettu);
        }
        onkoNumerotAlustettu = true;
        ka = laskeKeskiArvo(numerot,vanhaNumero);
        Scanner input = new Scanner(System.in);
        System.out.println("lukujen keskiarvo: " + ka);
        for (boolean jatketaan = true; jatketaan;) {
            System.out.println("Lisätäänkö luku (kylla? ");
            String vastaus = input.nextLine();

            if (!vastaus.equalsIgnoreCase("kylla")) {
                jatketaan = false;
            }
            //lisataan yksi uusi ja vanha luku poistetaan
            vanhaNumero = numerot.get(0);
            numerot = Harjoitus8.lisaaLuku(numerot, onkoNumerotAlustettu);
            ka = laskeKeskiArvo(numerot,vanhaNumero);
            System.out.println("lukujen keskiarvo: " + ka);

        }
        input.close();
    }
}
