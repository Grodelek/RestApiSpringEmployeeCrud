package org.luv2code.cruddemos.controllers;

import org.luv2code.cruddemos.models.Employee;
import org.luv2code.cruddemos.serivce.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/api")
    public String getApi(){
        return "Hello Api!";
    }

    @PostMapping("/api/employee")
    public String saveEmployees(){
        Employee employee = new Employee("Artur", "Kowalski", "abc@wp.pl");
        employeeService.save(employee);
        return "Employee number: "+ employee.getId()+" saved succesfully";
    }
    @GetMapping("/api/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAll();
    }
    @DeleteMapping("/api/employee/{id}")
    public String deleteById(@PathVariable int id){
        employeeService.deleteById(id);
        return "deleted employee: "+id;
    }
    @GetMapping("/api/employee/{id}")
    public Optional<Employee> getById(@PathVariable int id){
        return employeeService.getById(id);
    }
}
