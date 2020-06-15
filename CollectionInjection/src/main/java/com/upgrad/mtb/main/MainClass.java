package com.upgrad.mtb.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");
        //TODO use getBean method to get reference of  employee bean
    }
}
