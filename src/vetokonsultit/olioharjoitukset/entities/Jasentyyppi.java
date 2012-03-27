/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetokonsultit.olioharjoitukset.entities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pasi haverinen
 */
@Entity
@Table(name = "jasentyyppi", catalog = "vetokonsultit", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jasentyyppi.findAll", query = "SELECT j FROM Jasentyyppi j"),
    @NamedQuery(name = "Jasentyyppi.findByJasentyyppiid", query = "SELECT j FROM Jasentyyppi j WHERE j.jasentyyppiid = :jasentyyppiid"),
    @NamedQuery(name = "Jasentyyppi.findByTunnus", query = "SELECT j FROM Jasentyyppi j WHERE j.tunnus = :tunnus"),
    @NamedQuery(name = "Jasentyyppi.findBySelite", query = "SELECT j FROM Jasentyyppi j WHERE j.selite = :selite")})
public class Jasentyyppi implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "JASENTYYPPIID")
    private Long jasentyyppiid;
    @Column(name = "TUNNUS")
    private String tunnus;
    @Column(name = "SELITE")
    private String selite;
  
    public Jasentyyppi() {
    }

    public Jasentyyppi(Long jasentyyppiid) {
        this.jasentyyppiid = jasentyyppiid;
    }

    public Long getJasentyyppiid() {
        return jasentyyppiid;
    }

    public void setJasentyyppiid(Long jasentyyppiid) {
        Long oldJasentyyppiid = this.jasentyyppiid;
        this.jasentyyppiid = jasentyyppiid;
        changeSupport.firePropertyChange("jasentyyppiid", oldJasentyyppiid, jasentyyppiid);
    }

    public String getTunnus() {
        return tunnus;
    }

    public void setTunnus(String tunnus) {
        String oldTunnus = this.tunnus;
        this.tunnus = tunnus;
        changeSupport.firePropertyChange("tunnus", oldTunnus, tunnus);
    }

    public String getSelite() {
        return selite;
    }

    public void setSelite(String selite) {
        String oldSelite = this.selite;
        this.selite = selite;
        changeSupport.firePropertyChange("selite", oldSelite, selite);
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jasentyyppiid != null ? jasentyyppiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jasentyyppi)) {
            return false;
        }
        Jasentyyppi other = (Jasentyyppi) object;
        if ((this.jasentyyppiid == null && other.jasentyyppiid != null) || (this.jasentyyppiid != null && !this.jasentyyppiid.equals(other.jasentyyppiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vetokonsultit.olioharjoitukset.entities.Jasentyyppi[ jasentyyppiid=" + jasentyyppiid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
