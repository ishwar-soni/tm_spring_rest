package com.upgrad.mtb.beans;

import javax.persistence.*;

@Entity
public class Slot {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int id ;
    String time;

    @OneToOne(mappedBy = "slot")
    @JoinColumn(name = "theatreID")
    Theatre theatre ;

    public Slot() {
    }

    public Slot(int id, String time) {
        this.id = id;
        this.time = time;
    }
    public Slot(String time) {

        this.time = time;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
