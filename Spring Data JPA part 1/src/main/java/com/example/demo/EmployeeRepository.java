package com.example.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByNameAndLocation(String name,String location);

    List<Employee> findByAgeBetween(int age1,int age2);

    List<Employee> findByNameLike(String name);
}
