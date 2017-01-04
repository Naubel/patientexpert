/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "PATIENTS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p"),
    @NamedQuery(name = "Patients.findById", query = "SELECT p FROM Patients p WHERE p.id = :id"),
    @NamedQuery(name = "Patients.findByFname", query = "SELECT p FROM Patients p WHERE p.fname = :fname"),
    @NamedQuery(name = "Patients.findByLname", query = "SELECT p FROM Patients p WHERE p.lname = :lname"),
    @NamedQuery(name = "Patients.findByAge", query = "SELECT p FROM Patients p WHERE p.age = :age"),
    @NamedQuery(name = "Patients.findByAddress", query = "SELECT p FROM Patients p WHERE p.address = :address"),
    @NamedQuery(name = "Patients.findByCity", query = "SELECT p FROM Patients p WHERE p.city = :city"),
    @NamedQuery(name = "Patients.findByZip", query = "SELECT p FROM Patients p WHERE p.zip = :zip"),
    @NamedQuery(name = "Patients.findByPhone", query = "SELECT p FROM Patients p WHERE p.phone = :phone"),
    @NamedQuery(name = "Patients.findByEmail", query = "SELECT p FROM Patients p WHERE p.email = :email")})
public class Patients implements Serializable {

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
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ZIP")
    private Integer zip;
    @Column(name = "PHONE")
    private BigInteger phone;
    @Column(name = "EMAIL")
    private String email;

    public Patients() {
    }

    public Patients(Integer id) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        Integer oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        Integer oldZip = this.zip;
        this.zip = zip;
        changeSupport.firePropertyChange("zip", oldZip, zip);
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        BigInteger oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
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
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return fname + " " +lname;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
