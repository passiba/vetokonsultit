/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 2.1
 * 
 * Bussi luokka
 * 
 */
package vetokonsultit.olioharjoitukset;

/**
 *
 * @author pasi haverinen
 */
public class Bussi  implements Bussipalvelu{
    
    private int iMaara;
    private int istuintenMaara=50;
    private int vapaitaPaikkoja;

    private int getiMaara() {
        return iMaara;
    }

    public void setiMaara(int iMaara) {
        
        if(iMaara<=this.getIstuintenMaara())
        {
            this.iMaara = iMaara;
        }
    }

    private int getIstuintenMaara() {
        return istuintenMaara;
    }

   

    private int getVapaitaPaikkoja() {
        return this.getIstuintenMaara()-this.getiMaara();
    }

    @Override
    public void nouseeKyytiin(int iMaara) {
        //matkustajien max maara on 50 henkiloa
        if((this.iMaara + iMaara)<=this.getIstuintenMaara())
        {
            this.iMaara += iMaara;
        }
    }

    @Override
    public void hyppaaPois(int maara) {
       
       int matkustajiaKyydissa=this.getiMaara();
       if(maara<=matkustajiaKyydissa)
       {
            this.setiMaara(matkustajiaKyydissa-maara);
       }
    }

    @Override
    public int montakoIhmista() {
       return this.getiMaara();
    }

    @Override
    public int vapaitaIstumapaikkoja() {
       return this.getVapaitaPaikkoja();
    }

    @Override
    public int vapaitaPaikkoja() {
       return this.getVapaitaPaikkoja();
    }

    

    
}
