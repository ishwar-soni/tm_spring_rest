
package  com.upgrad.mtb.beans;
import com.sun.xml.bind.v2.model.core.ID;
import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
public class Language {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private String language;

    @OneToMany(mappedBy = "language")
    List<Movie> movies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", language='" + language + '\'' +
                '}';
    }
}
