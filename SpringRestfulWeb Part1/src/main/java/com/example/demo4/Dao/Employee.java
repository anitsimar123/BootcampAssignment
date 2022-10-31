package com.example.demo4.Dao;

import javax.validation.constraints.*;

public class Employee {


    private int id;
    @Size(min = 2, message = "Name should have atleast 2 characters")
    @NotBlank
    private String name;

    @Min(value = 1, message = "Age must be greater than 1")
    @Max(value = 100, message = "Age must be les than 100")
    private int age;


    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
