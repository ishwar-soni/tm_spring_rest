package com.upgrad.mtb.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private int id ;
    private String firstName,lastName;
    private List<String> technologies;
    private Set<String> domains;
    private Map<Integer,String> projects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public Set<String> getDomains() {
        return domains;
    }

    public void setDomains(Set<String> domains) {
        this.domains = domains;
    }

    public Map<Integer, String> getProjects() {
        return projects;
    }

    public void setProjects(Map<Integer, String> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", technologies=" + technologies +
                ", domains=" + domains +
                ", projects=" + projects +
                '}';
    }
}
