package com.upgrad.mtb.main;

import com.upgrad.mtb.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }
}
