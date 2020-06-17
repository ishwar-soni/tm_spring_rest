package com.upgrad.project.main;
import com.upgrad.project.services.GreetingService;
import com.upgrad.project.util.GreetingServiceFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");
        GreetingService service = (GreetingService)context.getBean("greetingService");
        System.out.println(service.sayHello("Satish","Mahajan"));

    }
}
