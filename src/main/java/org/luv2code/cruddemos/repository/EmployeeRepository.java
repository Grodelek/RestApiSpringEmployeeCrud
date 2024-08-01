package org.luv2code.cruddemos.repository;

import jakarta.transaction.Transactional;
import org.luv2code.cruddemos.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
}
