import com.upgrad.mtb.beans.Address;
import com.upgrad.mtb.beans.Employee;
import com.upgrad.mtb.daos.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new  ClassPathXmlApplicationContext("projectBeans.xml");
        EmployeeDAO employeeDAO = (EmployeeDAO)context.getBean("employeeDAO");

        List<String> mobileNumbers = new ArrayList<String>();
        mobileNumbers.add("8373667829");
        mobileNumbers.add("7328303009");

        Address address = new Address("Pune","Maharashtra","73773","India");
        Employee employee = new Employee(1,"Rajesh Kumar",address,mobileNumbers);

        Employee insertedEmployee = employeeDAO.save(employee);
        System.out.println(insertedEmployee);
    }
}
