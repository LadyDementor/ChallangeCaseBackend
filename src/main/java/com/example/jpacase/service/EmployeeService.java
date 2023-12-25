package com.example.jpacase.service;

import com.example.jpacase.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeList();

    Employee save(Employee employee);

     Employee getById( int id);


    Employee delete( int id);



}
