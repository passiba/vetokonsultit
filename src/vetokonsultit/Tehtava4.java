/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.4
 */
package vetokonsultit;

import java.util.Scanner;

/**
 *
 * @author pasi haverinen
 */
public class Tehtava4 {

    /*
     * vahennysasku methodi 
     *  luku1 syote luku1
     * luku2 syote luku2
     * vahennyslaskun arvo
     */
    private static int vahennysLasku(int luku1, int luku2) {
        return luku1 - luku2;
    }
    /*
     * yhteenlasku methodi 
     * luku1 syote luku1
     * luku2 syote luku2
     * yhteenlaskun arvo
     */

    private static int yhteenLasku(int luku1, int luku2) {
        return luku1 + luku2;
    }
    
    /*
     * Pyytää kayttajaa syottamaan luvun
     * palauttaa kokonaisluvun
     * 
     * 
     */
    private static int lueLuku()
    {
         String rivi;
         int luku=0;
        for (boolean jatketaan=true;jatketaan;) {
            try {
                System.out.print("Anna luku ");
                rivi = Lue.rivi();
                if (rivi != null) {
                    luku = Integer.parseInt(rivi);
                }
                jatketaan=false;

            } catch (NumberFormatException ne) {
            }
        }
        return luku;
        
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int luku1 = 0, luku2 = 0, toiminto = 0;
        //lue kaksi lukua konsolilta
        //eka luku
        luku1=Tehtava4.lueLuku();
        //toinen luku
        luku2=Tehtava4.lueLuku();

        System.out.print(luku1 +" ja  " +luku2 +" Summa(1) vai erotus(2) ");
        toiminto = input.nextInt();

        if (toiminto== 1) {
            System.out.print("Summa : " + Tehtava4.yhteenLasku(luku1, luku2));
        }

        if (toiminto== 2) {
            System.out.print("Erotus : " + Tehtava4.vahennysLasku(luku1, luku2));
        }

        input.close();
    }
}
