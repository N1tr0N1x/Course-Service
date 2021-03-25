package com.eler.ms.course.CourseService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.hibernate.annotations.Entity;


@Entity
//@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
@Table(name = "Modules")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idModule")
    private long idModule;

    @Column(name = "name")
    private String name;

    @Column(name = "credit")
    private int credit;

    @Column(name = "coefficient")
    private int coefficient;

    @Column(name = "vhCours")
    private int vhCours;

    @Column(name = "vhTd")
    private int vhTd;

    @Column(name = "vhTp")
    private int vhTp;

    @Column(name = "emailEnsCours")
    private String emailEnsCours;

    @Column(name = "emailEnsTd")
    private String emailEnsTd;

    @Column(name = "emailEnsTp")
    private String emailEnsTp;

    public long getIdModule() {
        return idModule;
    }

    public void setIdModule(long idModule) {
        this.idModule = idModule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getVhCours() {
        return vhCours;
    }

    public void setVhCours(int vhCours) {
        this.vhCours = vhCours;
    }

    public int getVhTd() {
        return vhTd;
    }

    public void setVhTd(int vhTd) {
        this.vhTd = vhTd;
    }

    public int getVhTp() {
        return vhTp;
    }

    public void setVhTp(int vhTp) {
        this.vhTp = vhTp;
    }

    public String getEmailEnsCours() {
        return emailEnsCours;
    }

    public void setEmailEnsCours(String emailEnsCours) {
        this.emailEnsCours = emailEnsCours;
    }

    public String getEmailEnsTd() {
        return emailEnsTd;
    }

    public void setEmailEnsTd(String emailEnsTd) {
        this.emailEnsTd = emailEnsTd;
    }

    public String getEmailEnsTp() {
        return emailEnsTp;
    }

    public void setEmailEnsTp(String emailEnsTp) {
        this.emailEnsTp = emailEnsTp;
    }

    public Module(long idModule, String name, int credit, int coefficient, int vhCours, int vhTd, int vhTp,
            String emailEnsCours, String emailEnsTd, String emailEnsTp) {
        this.idModule = idModule;
        this.name = name;
        this.credit = credit;
        this.coefficient = coefficient;
        this.vhCours = vhCours;
        this.vhTd = vhTd;
        this.vhTp = vhTp;
        this.emailEnsCours = emailEnsCours;
        this.emailEnsTd = emailEnsTd;
        this.emailEnsTp = emailEnsTp;
    }

    public Module() {
    }

    
    
    
}
