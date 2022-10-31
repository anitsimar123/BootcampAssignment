package com.example.demo4.DaoService;

import com.example.demo4.Dao.Employee;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

@Service
public class EmployeeService {

    private static Set<Employee> employeeServiceSet = new HashSet<>();


    static {
        employeeServiceSet.add(new Employee(1, "Amrit", 23));
        employeeServiceSet.add(new Employee(2, "Rakesh", 26));
        employeeServiceSet.add(new Employee(3, "Aarush", 24));
    }


    public Set<Employee> findAll() {
        return employeeServiceSet;
    }

    public Employee findById(int id) {
        return employeeServiceSet.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public Employee addUser(Employee user) {
        employeeServiceSet.add(user);
        return user;
    }

    public void deleteById(int id) {
        employeeServiceSet.removeIf(e -> e.getId() == id);
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
