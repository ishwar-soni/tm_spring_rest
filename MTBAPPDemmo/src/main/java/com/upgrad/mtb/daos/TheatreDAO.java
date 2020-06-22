package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreDAO extends JpaRepository<Theatre,Integer> {
}
