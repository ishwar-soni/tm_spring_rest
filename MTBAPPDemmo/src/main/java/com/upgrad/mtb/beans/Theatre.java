package  com.upgrad.mtb.beans;

import jdk.internal.instrumentation.InstrumentationMethod;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TheatreMaster")
public class Theatre {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    //@Column(columnDefinition = "varchar2(100) check in('IMAX','CITY PRIDE')",updatable = true)
    private String name;

    private int noOfSeats;

    private int ticketPrice;

}


