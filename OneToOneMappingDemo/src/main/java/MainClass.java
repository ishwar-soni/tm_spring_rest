
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new  ClassPathXmlApplicationContext("projectBeans.xml");

    }
}
