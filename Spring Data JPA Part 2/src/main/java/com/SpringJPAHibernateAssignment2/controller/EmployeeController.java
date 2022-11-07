package com.SpringJPAHibernateAssignment2.controller;

import com.SpringJPAHibernateAssignment2.entities.Employee;
import com.SpringJPAHibernateAssignment2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees1")
    public List<Object[]> getAllEmployeesP(){
        return employeeService.getAllEmployeesPartial();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employees/JPQLQuery1")
    public List<Object[]> getDataForJPQLQuery1(){
        return employeeService.getDataForJPQLQuery1();
    }

    @GetMapping("/employees/JPQLQuery2/{salary}")
    public String getDataForJPQLQuery2(@PathVariable double salary){
        int rowsAffected = employeeService.getDataForJPQLQuery2(salary);
         return rowsAffected + ":Rows affected";

    }

    @GetMapping("/employees/avgSal")
    public double getAvgSal(){
        return employeeService.getAvgSal();

    }


    @GetMapping("/employees/JPQLQuery3")
    public String getDataForJPQLQuery3(){
        int rowsAffected = employeeService.getDataForJPQLQuery3();
        return rowsAffected + ":Rows affected";

    }

    @GetMapping("/employees/minSal")
    public double getMinSal(){
        return employeeService.getMinSal();

    }

    @GetMapping("/employees/nativeQuery1")
    public List<Object[]> getDataForNQ1(){
        return employeeService.getDataForNQ1();
    }

    @GetMapping("/employees/nativeQuery2/{age}")
    public String deleteRecordeNQ2(@PathVariable int age){
        int rows = employeeService.getDataForNQ2(age);
        return rows + ":Rows affected";
    }



}
