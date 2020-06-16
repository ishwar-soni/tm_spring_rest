package com.upgrad.mtb.beans;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class Employee {
    private int id ;
    private String firstName,lastName;
    private List<String> technologies;
    private Set<String> domains;
    private Map<Integer,String> projects;
    private List<Address> addressList;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", technologies=" + technologies +
                ", domains=" + domains +
                ", projects=" + projects +
                ", addressList=" + addressList +
                '}';
    }
}
