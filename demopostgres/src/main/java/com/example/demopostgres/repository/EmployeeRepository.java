package com.example.demopostgres.repository;

import com.example.demopostgres.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findByFirstName(String firstName);

//    List<Employee> findByFirstNameOrLastName(String firstName, String lastName);
//    void deleteByFirstNameOrLastName(String firstName, String lastName);

//    @Query(value = "select count(1) from employee", nativeQuery= true)
//    long countSomething(long id, String name);
}
