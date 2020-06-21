package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee ,Integer> {
}
