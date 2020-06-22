package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDAO extends JpaRepository<Movie ,Integer> {
// Where is the code

    //Spring Data

}
