package com.upgrad.mtb.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String city,state,pinCode,country;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
