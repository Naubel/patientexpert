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
@Table(name = "TASKS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Tasks.findAll", query = "SELECT t FROM Tasks t"),
    @NamedQuery(name = "Tasks.findById", query = "SELECT t FROM Tasks t WHERE t.id = :id"),
    @NamedQuery(name = "Tasks.findByTname", query = "SELECT t FROM Tasks t WHERE t.tname = :tname"),
    @NamedQuery(name = "Tasks.findByTmessage", query = "SELECT t FROM Tasks t WHERE t.tmessage = :tmessage"),
    @NamedQuery(name = "Tasks.findByTstatus", query = "SELECT t FROM Tasks t WHERE t.tstatus = :tstatus"),
    @NamedQuery(name = "Tasks.findByTduedate", query = "SELECT t FROM Tasks t WHERE t.tduedate = :tduedate"),
    @NamedQuery(name = "Tasks.findByTduetime", query = "SELECT t FROM Tasks t WHERE t.tduetime = :tduetime")})
public class Tasks implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TNAME")
    private String tname;
    @Column(name = "TMESSAGE")
    private String tmessage;
    @Column(name = "TSTATUS")
    private String tstatus;
    @Column(name = "TDUEDATE")
    private String tduedate;
    @Column(name = "TDUETIME")
    private String tduetime;

    public Tasks() {
    }

    public Tasks(Integer id) {
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

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        String oldTname = this.tname;
        this.tname = tname;
        changeSupport.firePropertyChange("tname", oldTname, tname);
    }

    public String getTmessage() {
        return tmessage;
    }

    public void setTmessage(String tmessage) {
        String oldTmessage = this.tmessage;
        this.tmessage = tmessage;
        changeSupport.firePropertyChange("tmessage", oldTmessage, tmessage);
    }

    public String getTstatus() {
        return tstatus;
    }

    public void setTstatus(String tstatus) {
        String oldTstatus = this.tstatus;
        this.tstatus = tstatus;
        changeSupport.firePropertyChange("tstatus", oldTstatus, tstatus);
    }

    public String getTduedate() {
        return tduedate;
    }

    public void setTduedate(String tduedate) {
        String oldTduedate = this.tduedate;
        this.tduedate = tduedate;
        changeSupport.firePropertyChange("tduedate", oldTduedate, tduedate);
    }

    public String getTduetime() {
        return tduetime;
    }

    public void setTduetime(String tduetime) {
        String oldTduetime = this.tduetime;
        this.tduetime = tduetime;
        changeSupport.firePropertyChange("tduetime", oldTduetime, tduetime);
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
        if (!(object instanceof Tasks)) {
            return false;
        }
        Tasks other = (Tasks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Tasks[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
