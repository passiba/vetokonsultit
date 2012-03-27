/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetokonsultit.olioharjoitukset.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pasi haverinen
 */
@Entity
@Table(name = "luottamustoimi", catalog = "vetokonsultit", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Luottamustoimi.findAll", query = "SELECT l FROM Luottamustoimi l"),
    @NamedQuery(name = "Luottamustoimi.findByLuottamustoimiid", query = "SELECT l FROM Luottamustoimi l WHERE l.luottamustoimiid = :luottamustoimiid"),
    @NamedQuery(name = "Luottamustoimi.findByTunnus", query = "SELECT l FROM Luottamustoimi l WHERE l.tunnus = :tunnus"),
    @NamedQuery(name = "Luottamustoimi.findBySelite", query = "SELECT l FROM Luottamustoimi l WHERE l.selite = :selite")})
public class Luottamustoimi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LUOTTAMUSTOIMIID")
    private Long luottamustoimiid;
    @Column(name = "TUNNUS")
    private String tunnus;
    @Column(name = "SELITE")
    private String selite;
   
    public Luottamustoimi() {
    }

    public Luottamustoimi(Long luottamustoimiid) {
        this.luottamustoimiid = luottamustoimiid;
    }

    public Long getLuottamustoimiid() {
        return luottamustoimiid;
    }

    public void setLuottamustoimiid(Long luottamustoimiid) {
        this.luottamustoimiid = luottamustoimiid;
    }

    public String getTunnus() {
        return tunnus;
    }

    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }

    public String getSelite() {
        return selite;
    }

    public void setSelite(String selite) {
        this.selite = selite;
    }

  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (luottamustoimiid != null ? luottamustoimiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Luottamustoimi)) {
            return false;
        }
        Luottamustoimi other = (Luottamustoimi) object;
        if ((this.luottamustoimiid == null && other.luottamustoimiid != null) || (this.luottamustoimiid != null && !this.luottamustoimiid.equals(other.luottamustoimiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vetokonsultit.olioharjoitukset.entities.Luottamustoimi[ luottamustoimiid=" + luottamustoimiid + " ]";
    }
    
}
