/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 1.2
 */
package vetokonsultit;

/**
 *
 * @author pasi haverinen
 * laskutehtavia
 * 
 */
public class Tehtava2 {
    
     public static int a = 12, b = 32, c = -23; 
    /**
     * kertolasku methodi tehtava1
     * @param luku1 syote luku1
     * @param luku2 syote luku2
     * @return yhteenlaskun arvo
     */
    public int kertoLasku(int luku1, int luku2)
    {
        return luku1*luku2;
    }
     /**
     * jakolasku methodi tehtava2
     * @param luku1 syote luku1
     * @param luku2 syote luku2
     * @return jakolaskun arvo
     */
    public double jakoLasku(double luku1, double luku2)
    {
        return luku1/luku2;
    }
     /**
     * tehtava 3
     * @param luku1 syote luku1
     * @param luku2 syote luku2
     * @param luku2 syote luku3
     * @return jakolaskun arvo
     */
    public double laskeArvot(double luku1, double luku2,double luku3)
    {
        return luku1/luku2*luku3;
    }
     
}
