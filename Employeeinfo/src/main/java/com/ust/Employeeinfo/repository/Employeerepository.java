package com.ust.Employeeinfo.repository;

import com.ust.Employeeinfo.client.Fullresponse;
import com.ust.Employeeinfo.model.Employee;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Employeerepository extends JpaRepository<Employee,Long> {

    Optional<Employee> findByCcode(Long ccode);
}
