package com.example.demo4.DaoService;

import com.example.demo4.Dao.Employee;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private static Set<Employee> employeeServiceSet = new HashSet<>();


    private static int count=0;
    static {
        employeeServiceSet.add(new Employee(++count, "Amrit", 23));
        employeeServiceSet.add(new Employee(++count, "Rakesh", 26));
        employeeServiceSet.add(new Employee(++count, "Aarush", 24));
    }


    public Set<Employee> findAll() {
        return employeeServiceSet;
    }

    public Employee findById(int id) {
        return employeeServiceSet.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public Employee addUser(Employee user) {
        user.setId(++count);
        employeeServiceSet.add(user);
        return user;
    }

    public void deleteById(int id) {
        employeeServiceSet = employeeServiceSet.stream().filter(e->e.getId()!=id).collect(Collectors.toSet());
    }

    public void updateUserById(Employee employee, int id) {

        for (Employee employee1 : employeeServiceSet) {
            if (employee1.getId() == id) {
                employee1.setId(employee.getId());
                employee1.setAge(employee.getAge());
                employee1.setName(employee.getName());
                break;
            }
        }
    }
}
