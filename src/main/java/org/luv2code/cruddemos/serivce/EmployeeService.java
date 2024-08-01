package org.luv2code.cruddemos.serivce;

import org.luv2code.cruddemos.models.Employee;
import org.luv2code.cruddemos.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public void save(Employee employee){
        employeeRepository.save(employee);
    }
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
    public String deleteById(int id){
        employeeRepository.deleteById(id);
        return "deleted id: "+id;
    }
    public Optional<Employee> getById(int id){
       return employeeRepository.findById(id);
    }

}
