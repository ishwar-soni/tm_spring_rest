package  com.upgrad.mtb.beans;

import jdk.internal.instrumentation.InstrumentationMethod;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity

public class Theatre {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    //@Column(columnDefinition = "varchar2(100) check in('IMAX','CITY PRIDE')",updatable = true)
    private String name;

    private int noOfSeats;

    private int ticketPrice;

    @OneToOne
    @JoinColumn(name = "slotID")
    Slot slot;

    @ManyToMany
    List<Movie> movies ;
    public Theatre( String name, int noOfSeats, int ticketPrice) {

        this.name = name;
        this.noOfSeats = noOfSeats;
        this.ticketPrice = ticketPrice;
    }


    public Theatre(int id, String name, int noOfSeats, int ticketPrice) {
        this.id = id;
        this.name = name;
        this.noOfSeats = noOfSeats;
        this.ticketPrice = ticketPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}


