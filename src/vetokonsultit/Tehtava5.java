/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.5
 */
package vetokonsultit;

import java.util.Scanner;

/**
 *
 * @author pasi haverinen
 */
public class Tehtava5 {

    /*
     * Pyytää kayttajaa syottamaan luvun
     * palauttaa kokonaisluvun
     * 
     * 
     */
    private static int AnnaArvosana() {
        String rivi;
        int luku = 0;
       for (boolean jatketaan=true;jatketaan;) {
            try {
                System.out.print("Anna arvosana hylätty(0), heikko(1-5), keskinkertainen(6-10), hyvä(11-14), erinomainen(15)  ");
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

    private static void AnnaArvio() {
        Scanner input = new Scanner(System.in);
        Arvostelu arvio = new Arvostelu();
        System.out.print("Anna nimi ?");
        arvio.setNimi(input.nextLine());

        //arvostellaan anneteut tehtavat
        for (int i = 1; i < 6; i++) {
            String tehtava = null;
            int arvosana = 0;
            System.out.print("Anna tehtava?");
            tehtava = input.nextLine();
            arvosana = Tehtava5.AnnaArvosana();
            if (tehtava != null) {
                arvio.SetArvosana(tehtava, arvosana);
            }
        }
        input.close();

        System.out.println("Arvosana tehtavista:" + arvio.naytaArvosanat());
        System.out.println("Keskiarvo :" + arvio.getKeskiarvo());
    }

    public static void main(String[] args) {


        Tehtava5.AnnaArvio();



    }
}
