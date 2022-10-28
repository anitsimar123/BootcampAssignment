package org.example.Q4;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {

    int id;

    String name;

    @Autowired
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee Details: \n"+"id=" + id +
                ", name='" + name;
    }

}
