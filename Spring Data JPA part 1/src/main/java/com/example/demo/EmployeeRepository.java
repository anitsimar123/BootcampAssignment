package com.example.demo;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByNameAndLocation(String name,String location);

    List<Employee> findByAgeBetween(int age1,int age2);

    List<Employee> findByNameLike(String name);

    @Query("from Employee e")
    List<Employee> getAll(PageRequest pageRequest);

    @Query("from Employee where name = :n and location = :loc")
    List<Employee>getByNameAndLoc(@Param("n") String name, @Param("loc") String location,PageRequest pageRequest);

    @Query(value ="select * from employee", nativeQuery = true)
    List<Employee> getAllEmployee();

    @Query(value = "select * from employee where name = :n and location = :loc",nativeQuery = true)
    List<Employee>getByNameAndLocNative(@Param("n") String name, @Param("loc") String location);

    @Query("from Employee where age> :min and age< :max")
    List<Employee> getAgeInBetween(@Param("min") int min,@Param("max") int max,PageRequest pageRequest);

    @Query(value = "delete from Employee where name = :name")
    @Modifying
    void deleteQuery(@Param("name") String name);
}
