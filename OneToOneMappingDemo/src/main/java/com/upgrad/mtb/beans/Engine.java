package com.upgrad.mtb.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
    @Id private int id;
    private String type;
}
