/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.2
 * 
 * opiskelija luokka
 * 
 */
package vetokonsultit.olioharjoitukset;

/**
 *
 * @author pasi haverinen
 */
public class Opiskelija {
    
    private String nimi;
    private long opiskelijanro;
    private String opiskelulinja;
    
    public static long seuraavaOpiskeluNumero=0;
    
    private int opintoviikkojenlkm;

    public Opiskelija(String nimi, String opiskelulinja) {
        this.nimi = nimi;
        this.opiskelulinja = opiskelulinja;
        //lisätään opiskelijanumero
        this.opiskelijanro=seuraavaOpiskeluNumero++;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getOpintoviikkojenlkm() {
        return opintoviikkojenlkm;
    }

    public void setOpintoviikkojenlkm(int opintoviikkojenlkm) {
        this.opintoviikkojenlkm = opintoviikkojenlkm;
    }

    public long getOpiskelijanro() {
        return opiskelijanro;
    }

    public void setOpiskelijanro(long opiskelijanro) {
        if(this.opiskelijanro  > 0)
        {
            this.opiskelijanro=opiskelijanro;
        }
    }

    public String getOpiskelulinja() {
        return opiskelulinja;
    }

    public void setOpiskelulinja(String opiskelulinja) {
        this.opiskelulinja = opiskelulinja;
    }

    @Override
    public String toString() {
        return "Opiskelija{" + "nimi=" + nimi + ", opiskelijanro=" + opiskelijanro + ", opiskelulinja=" + opiskelulinja + ", opintoviikkojenlkm=" + opintoviikkojenlkm + '}';
    }
    
    
    
}
