/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.2
 * 
 * opiskelijapalvelu interface
 * 
 */
package vetokonsultit.olioharjoitukset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author pasi haverinen
 */
public class OpiskelijaJoukko implements Opiskelupalvelu {

    
    //sisältaa opiskelijajoukon tiedot
    private HashMap<Long, Opiskelija> opiskelijat = new HashMap<Long, Opiskelija>();
    
    
    
    @Override
    public void lisaaOpiskelija(Opiskelija opiskelija) {
       if(opiskelija !=null && ! this.getOpiskelijat().containsKey(opiskelija.getOpiskelijanro()))
       {
        this.getOpiskelijat().put(Long.valueOf(opiskelija.getOpiskelijanro()),opiskelija);
       }
    }

    @Override
    public Collection<Opiskelija> kaikkiOpiskelijat() {
        return this.getOpiskelijat().values();
    }

    @Override
    public Opiskelija annaOpiskelija(long oNro) throws OpiskelijaEiLoytynytException{
        
       Opiskelija opiskelija=null; 
        if(!  this.getOpiskelijat().isEmpty() &&  this.getOpiskelijat().containsKey(oNro))
        {
            opiskelija=getOpiskelijat().get(oNro);
        }else
        {
            throw new OpiskelijaEiLoytynytException("Opiskelijaa ei loytynyt");
        } if(! this.getOpiskelijat().isEmpty() && this.getOpiskelijat().containsKey(oNro))
        {
            opiskelija= this.getOpiskelijat().get(oNro);
        }
        return opiskelija;
    }

    @Override
    public void valmistui(long oNro) throws OpiskelijaEiLoytynytException {
         if(! this.getOpiskelijat().isEmpty() &&  this.getOpiskelijat().containsKey(oNro))
        {
             this.getOpiskelijat().remove(oNro);
        }else
        {
            throw new OpiskelijaEiLoytynytException("Opiskelijaa ei loytynyt");
        } 
        
    }

    @Override
    public void tulostaKaikkienOpiskelijoidenTiedot() {
       for(Opiskelija opiskelija: this.getOpiskelijat().values())
       {
           System.out.println(" opiskelijan tiedot: "+ opiskelija.toString());
       }
    }

    public HashMap<Long, Opiskelija> getOpiskelijat() {
        return opiskelijat;
    }
    
    
}
