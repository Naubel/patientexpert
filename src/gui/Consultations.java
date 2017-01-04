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
@Table(name = "CONSULTATIONS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Consultations.findAll", query = "SELECT c FROM Consultations c"),
    @NamedQuery(name = "Consultations.findById", query = "SELECT c FROM Consultations c WHERE c.id = :id"),
    @NamedQuery(name = "Consultations.findByFname", query = "SELECT c FROM Consultations c WHERE c.fname = :fname"),
    @NamedQuery(name = "Consultations.findByLname", query = "SELECT c FROM Consultations c WHERE c.lname = :lname"),
    @NamedQuery(name = "Consultations.findByDiagnosis", query = "SELECT c FROM Consultations c WHERE c.diagnosis = :diagnosis"),
    @NamedQuery(name = "Consultations.findByCondition", query = "SELECT c FROM Consultations c WHERE c.condition = :condition"),
    @NamedQuery(name = "Consultations.findByPerscription", query = "SELECT c FROM Consultations c WHERE c.perscription = :perscription"),
    @NamedQuery(name = "Consultations.findByDate", query = "SELECT c FROM Consultations c WHERE c.date = :date")})
public class Consultations implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FNAME")
    private String fname;
    @Column(name = "LNAME")
    private String lname;
    @Column(name = "DIAGNOSIS")
    private String diagnosis;
    @Column(name = "CONDITION")
    private String condition;
    @Column(name = "PERSCRIPTION")
    private String perscription;
    @Column(name = "DATE")
    private String date;

    public Consultations() {
    }

    public Consultations(Integer id) {
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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        String oldLname = this.lname;
        this.lname = lname;
        changeSupport.firePropertyChange("lname", oldLname, lname);
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        String oldDiagnosis = this.diagnosis;
        this.diagnosis = diagnosis;
        changeSupport.firePropertyChange("diagnosis", oldDiagnosis, diagnosis);
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        String oldCondition = this.condition;
        this.condition = condition;
        changeSupport.firePropertyChange("condition", oldCondition, condition);
    }

    public String getPerscription() {
        return perscription;
    }

    public void setPerscription(String perscription) {
        String oldPerscription = this.perscription;
        this.perscription = perscription;
        changeSupport.firePropertyChange("perscription", oldPerscription, perscription);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
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
        if (!(object instanceof Consultations)) {
            return false;
        }
        Consultations other = (Consultations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Consultations[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
