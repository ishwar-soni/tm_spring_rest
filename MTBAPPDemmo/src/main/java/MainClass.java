import com.upgrad.mtb.beans.Language;
import com.upgrad.mtb.beans.Movie;
import com.upgrad.mtb.beans.Theatre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");
        Language language=(Language) context.getBean("language");   //Object   ----> Downcast   ---->Language
        System.out.println(language);

        Movie movie = (Movie)context.getBean("movie");
        System.out.println(movie);

        Theatre theatre = context.getBean("theatre",Theatre.class);
        System.out.println(theatre);

    }
}
