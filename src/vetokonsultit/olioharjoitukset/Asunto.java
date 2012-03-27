/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.3
 * 
 * Asunto luokka
 * 
 */
package vetokonsultit.olioharjoitukset;

/**
 *
 * @author pasi haverinen
 */
public class Asunto {
    
    private int huoneita=0;
    private String sijainti;
    private int kerros=0;

    public Asunto(String sijainti,int kerros,int huoneita) {
        this.sijainti = sijainti;
        this.huoneita=huoneita;
        this.kerros=kerros;
    }

    public int getHuoneita() {
        return huoneita;
    }

    public int getKerros() {
        return kerros;
    }

    public String getSijainti() {
        return sijainti;
    }
    
    
    
}
