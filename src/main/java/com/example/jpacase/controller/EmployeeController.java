package com.example.jpacase.controller;


import com.example.jpacase.repostory.EmployeeRepository;
import com.example.jpacase.entity.Employee;
import com.example.jpacase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    private EmployeeService employeeService;



    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public List<Employee> find(){
    return employeeService.getEmployeeList();

}


    @GetMapping("/{id}")
    public Employee findById(@PathVariable int id){
        return employeeService.getById(id);

    }



@PostMapping("/")
    public Employee saveOrUpdate(@RequestBody Employee employee){
        return employeeService.save(employee);
}


@DeleteMapping("/{id}")
    public Employee delete(@PathVariable int id){
        return employeeService.delete(id);
}


}
