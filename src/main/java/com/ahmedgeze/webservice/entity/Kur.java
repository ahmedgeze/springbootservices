package com.ahmedgeze.webservice.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Kur {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;



   @Column
   private String kur;



   @Basic(optional = false)
   @Column(name = "date", insertable = false, updatable = false)
   @Temporal(TemporalType.TIMESTAMP)
   private Date date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKur() {
        return kur;
    }

    public void setKur(String kur) {
        this.kur = kur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
