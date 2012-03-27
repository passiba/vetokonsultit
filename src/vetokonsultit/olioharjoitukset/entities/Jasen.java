/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetokonsultit.olioharjoitukset.entities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pasi haverinen
 */
@Entity
@Table(name = "jasen", catalog = "vetokonsultit", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jasen.findAll", query = "SELECT j FROM Jasen j"),
    @NamedQuery(name = "Jasen.findByJasenid", query = "SELECT j FROM Jasen j WHERE j.jasenid = :jasenid"),
    @NamedQuery(name = "Jasen.findByTunnus", query = "SELECT j FROM Jasen j WHERE j.tunnus = :tunnus"),
    @NamedQuery(name = "Jasen.findByEtunimet", query = "SELECT j FROM Jasen j WHERE j.etunimet = :etunimet"),
    @NamedQuery(name = "Jasen.findBySukunimi", query = "SELECT j FROM Jasen j WHERE j.sukunimi = :sukunimi"),
    @NamedQuery(name = "Jasen.findByPuhelin", query = "SELECT j FROM Jasen j WHERE j.puhelin = :puhelin"),
    @NamedQuery(name = "Jasen.findBySahkoposti", query = "SELECT j FROM Jasen j WHERE j.sahkoposti = :sahkoposti")})
public class Jasen implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "JASENID")
    private Long jasenid;
    @Column(name = "TUNNUS")
    private String tunnus;
    @Column(name = "ETUNIMET")
    private String etunimet;
    @Column(name = "SUKUNIMI")
    private String sukunimi;
    @Column(name = "PUHELIN")
    private String puhelin;
    @Column(name = "SAHKOPOSTI")
    private String sahkoposti;
    @JoinColumn(name = "TYYPPIID", referencedColumnName = "JASENTYYPPIID")
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Jasentyyppi tyyppiid;
    @JoinColumn(name = "LUOTTAMUSTOIMIID", referencedColumnName = "LUOTTAMUSTOIMIID")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Luottamustoimi luottamustoimiid;

    public Jasen() {
    }

    public Jasen(Long jasenid) {
        this.jasenid = jasenid;
    }

    public Long getJasenid() {
        return jasenid;
    }

    public void setJasenid(Long jasenid) {
        Long oldJasenid = this.jasenid;
        this.jasenid = jasenid;
        changeSupport.firePropertyChange("jasenid", oldJasenid, jasenid);
    }

    public String getTunnus() {
        return tunnus;
    }

    public void setTunnus(String tunnus) {
        String oldTunnus = this.tunnus;
        this.tunnus = tunnus;
        changeSupport.firePropertyChange("tunnus", oldTunnus, tunnus);
    }

    public String getEtunimet() {
        return etunimet;
    }

    public void setEtunimet(String etunimet) {
        String oldEtunimet = this.etunimet;
        this.etunimet = etunimet;
        changeSupport.firePropertyChange("etunimet", oldEtunimet, etunimet);
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        String oldSukunimi = this.sukunimi;
        this.sukunimi = sukunimi;
        changeSupport.firePropertyChange("sukunimi", oldSukunimi, sukunimi);
    }

    public String getPuhelin() {
        return puhelin;
    }

    public void setPuhelin(String puhelin) {
        String oldPuhelin = this.puhelin;
        this.puhelin = puhelin;
        changeSupport.firePropertyChange("puhelin", oldPuhelin, puhelin);
    }

    public String getSahkoposti() {
        return sahkoposti;
    }

    public void setSahkoposti(String sahkoposti) {
        String oldSahkoposti = this.sahkoposti;
        this.sahkoposti = sahkoposti;
        changeSupport.firePropertyChange("sahkoposti", oldSahkoposti, sahkoposti);
    }

    public Jasentyyppi getTyyppiid() {
        return tyyppiid;
    }

    public void setTyyppiid(Jasentyyppi tyyppiid) {
        Jasentyyppi oldTyyppiid = this.tyyppiid;
        this.tyyppiid = tyyppiid;
        changeSupport.firePropertyChange("tyyppiid", oldTyyppiid, tyyppiid);
    }

    public Luottamustoimi getLuottamustoimiid() {
        return luottamustoimiid;
    }

    public void setLuottamustoimiid(Luottamustoimi luottamustoimiid) {
        Luottamustoimi oldLuottamustoimiid = this.luottamustoimiid;
        this.luottamustoimiid = luottamustoimiid;
        changeSupport.firePropertyChange("luottamustoimiid", oldLuottamustoimiid, luottamustoimiid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jasenid != null ? jasenid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jasen)) {
            return false;
        }
        Jasen other = (Jasen) object;
        if ((this.jasenid == null && other.jasenid != null) || (this.jasenid != null && !this.jasenid.equals(other.jasenid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vetokonsultit.olioharjoitukset.entities.Jasen[ jasenid=" + jasenid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
