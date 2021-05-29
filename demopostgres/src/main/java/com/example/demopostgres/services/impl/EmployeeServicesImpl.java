package com.example.demopostgres.services.impl;

import com.example.demopostgres.entity.Employee;
import com.example.demopostgres.repository.EmployeeRepository;
import com.example.demopostgres.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeServicesImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    //@org.springframework.transaction.annotation.Transactional(readOnly = true)
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

//    @Override
//    public Employee findById(int id) {
//        return  employeeRepository.findById(id).get();
//    }
    @Override
    public List<Employee> findByFirstName(String firstName) {
        return  employeeRepository.findByFirstName(firstName);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAll() {
        Iterable<Employee> employeeIterable = employeeRepository.findAll();
        List<Employee> employeeList = new ArrayList<>();
        employeeIterable.forEach(employeeList::add);
        return employeeList;
    }

}
