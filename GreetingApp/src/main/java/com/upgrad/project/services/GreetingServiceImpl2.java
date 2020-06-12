package com.upgrad.project.services;

public class GreetingServiceImpl2 implements GreetingService{
    public String sayHello(String firstName, String lastName) {
        return "Impl2 says hello "+firstName+" "+lastName;
    }

    public String sayHi(String firstName, String lastName) {
        return "Impl2 says Hi "+firstName+" "+lastName;
    }
}
