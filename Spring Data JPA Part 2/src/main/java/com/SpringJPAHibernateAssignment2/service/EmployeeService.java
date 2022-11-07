package com.SpringJPAHibernateAssignment2.service;

import com.SpringJPAHibernateAssignment2.entities.Employee;
import com.SpringJPAHibernateAssignment2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public List<Object[]> getAllEmployeesPartial() {
        return employeeRepository.getAllEmps();
    }


    public List<Object[]> getDataForJPQLQuery1() {
        return employeeRepository.JPQLQuery1();
    }


    public double getAvgSal() {
        return employeeRepository.getAvgSal();
    }


    @Transactional
    public int getDataForJPQLQuery2(double salary) {

        double avg  = employeeRepository.getAvgSal();

        int result = employeeRepository.JPQLQuery2(salary,avg);

//        int result = employeeRepository.nativeQuery0(salary);
        System.out.println(result + "rows affected");
        return result;
    }


    public double getMinSal() {
        return employeeRepository.getMinSal();
    }


    @Transactional
    public int getDataForJPQLQuery3() {
        double minSalary = employeeRepository.getMinSal();
        return employeeRepository.JPQLQuery3(minSalary);
    }


    public List<Object[]> getDataForNQ1() {
        return employeeRepository.nativeQuery1();
    }


    @Transactional
    public int getDataForNQ2(int age) {
        return employeeRepository.nativeQuery2(age);
    }
}
