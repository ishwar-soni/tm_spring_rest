package com.upgrad.project.main;

import com.upgrad.project.services.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");

        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        System.out.println( greetingService.sayHello("Satish","Mahajan"));
        System.out.println(greetingService.sayHi("Satish","Mahajan"));
    }
}
