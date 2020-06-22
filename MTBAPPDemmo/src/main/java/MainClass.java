import com.upgrad.mtb.beans.Language;
import com.upgrad.mtb.beans.Movie;
import com.upgrad.mtb.beans.Theatre;
import com.upgrad.mtb.daos.MovieDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");

        MovieDAO movieDAO = (MovieDAO) context.getBean("movieDAO");
        Movie movie1 = new Movie("Dhoom","Movie about bike racing", new Date("22/10/2020"), 180, "coverPhotoURL" , "trailerURL");
        Movie insertedMovie =  movieDAO.save(movie1);
        System.out.println(insertedMovie);


    }
}
