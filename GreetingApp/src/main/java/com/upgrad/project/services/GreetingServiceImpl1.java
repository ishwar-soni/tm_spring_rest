package com.upgrad.project.services;

public class GreetingServiceImpl1 implements GreetingService{
    public String sayHello(String firstName, String lastName) {
        return "Impl1 says hello "+firstName+" "+lastName;
    }

    public String sayHi(String firstName, String lastName) {
        return "Impl1 says Hi "+firstName+" "+lastName;
    }
}
