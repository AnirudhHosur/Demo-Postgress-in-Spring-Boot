package com.example.demopostgres.services;

import com.example.demopostgres.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee save(Employee employee);
//  Employee findById(int id);

    List<Employee> findByFirstName(String firstName);

    void deleteById(int id);
    List<Employee> findAll();
}
