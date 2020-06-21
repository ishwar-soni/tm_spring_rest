package com.upgrad.mtb.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Address address ;
    private List<String> mobileNumbers;

    public Employee() {}

    public Employee(int id, String name, Address address, List<String> mobileNumbers) {
        this.id = id;
        this.name = name;

        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<String> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }
}
