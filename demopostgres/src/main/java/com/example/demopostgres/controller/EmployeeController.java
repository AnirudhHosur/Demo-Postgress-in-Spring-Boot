package com.example.demopostgres.controller;

import com.example.demopostgres.entity.Employee;
import com.example.demopostgres.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

//    @GetMapping(value = "{employeeId}")
//    Employee findById(@PathVariable("employeeId") int id) {
//        return employeeService.findById(id);
//    }


    @GetMapping(value = "/findAll")
    List<Employee> findAll() {
        return employeeService.findAll();
    }

    @PostMapping()
    Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @DeleteMapping(value = "{ID}")
    void deleteById(@PathVariable int ID) {
        employeeService.deleteById(ID);
    }

    @GetMapping(value = "/{findByFirstName}")
    List<Employee> findByFirstName(@PathVariable("findByFirstName") String name) {
        return employeeService.findByFirstName(name);
    }
}



