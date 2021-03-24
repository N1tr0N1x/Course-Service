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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "credit")
    private int credit;

    @Column(name = "coefficient")
    private int coefficient;

    @Column(name = "vh_cours")
    private int vh_cours;

    @Column(name = "vh_td")
    private int vh_td;

    @Column(name = "vh_tp")
    private int vh_tp;

    @Column(name = "email_ens_cours")
    private String email_ens_cours;

    @Column(name = "email_ens_td")
    private String email_ens_td;

    @Column(name = "email_ens_tp")
    private String email_ens_tp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    }public int getVh_cours() {
        return vh_cours;
    }

    public void setVh_cours(int vh_cours) {
        this.vh_cours = vh_cours;



    }public int getVh_td() {
        return vh_td;
    }

    public void setVh_td(int vh_td) {
        this.vh_td = vh_td;


    }public int getVh_tp() {
        return vh_tp;
    }

    public void setVh_tp(int vh_tp) {
        this.vh_tp = vh_tp;
    }

    public String getEmail_ens_cours() {
        return email_ens_cours;
    }

    public void setEmail_ens_cours(String email_ens_cours) {
        this.email_ens_cours = email_ens_cours;
    }

    public String getEmail_ens_td() {
        return email_ens_td;
    }

    public void setEmail_ens_td(String email_ens_td) {
        this.email_ens_td = email_ens_td;
    }
    public String getEmail_ens_tp() {
        return email_ens_tp;
    }

    public void setEmail_ens_tp(String email_ens_tp) {
        this.email_ens_tp = email_ens_tp;
    }


    public Module() {
    }

    public Module(long id, String name, int credit, int coefficient, int vh_cours, int vh_td,
     int vh_tp , String email_ens_cours, String email_ens_td, String email_ens_tp){
        super();
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.coefficient = coefficient;
        this.vh_cours = vh_cours;
        this.vh_td = vh_td;
        this.vh_tp = vh_tp;
        this.email_ens_cours = email_ens_cours;
        this.email_ens_td = email_ens_td;
        this.email_ens_tp = email_ens_tp;
    }

    
}
