/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.5
 * 
 * Sisaltaa annettujen koetehtavien arvosanat
 * 
 */
package vetokonsultit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author pasi haverinen
 */
public class Arvostelu {    
    
    private String nimi;
    private double summa;
    private HashMap<String, Integer> arvosanat = new HashMap<String, Integer>();

    public HashMap<String, Integer> getArvosanat() {
        return arvosanat;
    }

    /*public void setArvosanat(HashMap<String, Integer> arvosanat) {
        this.arvosanat = arvosanat;
    }*/
    public void SetArvosana(String tehtava,int arvosana)
    {
        //tarkistetaan ettei sitä ole jo lisätty
        if(!arvosanat.containsKey(tehtava))
        {    
            arvosanat.put(tehtava, arvosana);
        }
        //lasketaan arvosanojen summa
        this.summa+=arvosana;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKeskiarvo() {
        
       double ka=0.0;
       Set keys= this.getArvosanat().keySet();
       if(keys!=null && !keys.isEmpty())
       {
               double tehtavienlkm=keys.size();
               ka=summa/tehtavienlkm;
       }
       return ka;
       
    }

   

    public double getSumma() {
        return summa;
    }
    public String naytaArvosanat()
    {
           
           StringBuffer buffer=new StringBuffer();
           Set keys= this.getArvosanat().keySet();
           for(Iterator iter=keys.iterator();iter.hasNext();)
           {
               String tehtava=(String)iter.next();
               Integer numero=this.getArvosanat().get(tehtava);
               
               buffer.append(" "+ tehtava +" : arvosana: ");
               buffer.append(numero.intValue());
               
           }
           return buffer.toString();
        
    }
    
    
}
