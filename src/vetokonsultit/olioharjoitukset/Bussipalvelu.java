/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.1
 * 
 * Bussipalvelu interface - maarittelee Bussiluokan metodin
 * 
 * 
 */
package vetokonsultit.olioharjoitukset;

/**
 *
 * @author pasihaverinen
 */
public interface Bussipalvelu {
    
    public abstract void nouseeKyytiin(int iMaara);
    public abstract void hyppaaPois(int iMaara);
    public int montakoIhmista();
    public int vapaitaIstumapaikkoja();
    public int vapaitaPaikkoja();
    
}
