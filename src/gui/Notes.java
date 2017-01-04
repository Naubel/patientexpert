/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Alexander
 */
@Entity
@Table(name = "NOTES", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Notes.findAll", query = "SELECT n FROM Notes n"),
    @NamedQuery(name = "Notes.findById", query = "SELECT n FROM Notes n WHERE n.id = :id"),
    @NamedQuery(name = "Notes.findByNname", query = "SELECT n FROM Notes n WHERE n.nname = :nname"),
    @NamedQuery(name = "Notes.findByNmessage", query = "SELECT n FROM Notes n WHERE n.nmessage = :nmessage"),
    @NamedQuery(name = "Notes.findByNdate", query = "SELECT n FROM Notes n WHERE n.ndate = :ndate"),
    @NamedQuery(name = "Notes.findByNtime", query = "SELECT n FROM Notes n WHERE n.ntime = :ntime")})
public class Notes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NNAME")
    private String nname;
    @Column(name = "NMESSAGE")
    private String nmessage;
    @Column(name = "NDATE")
    private String ndate;
    @Column(name = "NTIME")
    private String ntime;

    public Notes() {
    }

    public Notes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        String oldNname = this.nname;
        this.nname = nname;
        changeSupport.firePropertyChange("nname", oldNname, nname);
    }

    public String getNmessage() {
        return nmessage;
    }

    public void setNmessage(String nmessage) {
        String oldNmessage = this.nmessage;
        this.nmessage = nmessage;
        changeSupport.firePropertyChange("nmessage", oldNmessage, nmessage);
    }

    public String getNdate() {
        return ndate;
    }

    public void setNdate(String ndate) {
        String oldNdate = this.ndate;
        this.ndate = ndate;
        changeSupport.firePropertyChange("ndate", oldNdate, ndate);
    }

    public String getNtime() {
        return ntime;
    }

    public void setNtime(String ntime) {
        String oldNtime = this.ntime;
        this.ntime = ntime;
        changeSupport.firePropertyChange("ntime", oldNtime, ntime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notes)) {
            return false;
        }
        Notes other = (Notes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Notes[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
