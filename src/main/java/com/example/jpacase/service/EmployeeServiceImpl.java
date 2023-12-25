package com.example.jpacase.service;

import com.example.jpacase.entity.Employee;
import com.example.jpacase.repostory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee delete(int id) {
        Employee employee=getById(id);
         employeeRepository.deleteById(id);
         return employee;
    }
}
