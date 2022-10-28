package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    EmployeeService employeeService;

    @Test
    void createStudent() {
        Student employee = new Student();
//        employee.setId(100);
        employee.setLname("Singh");
        employee.setFname("Amrit");
        employee.setScore(85);
        employeeService.save(employee);
    }

    @Test
    void findAll() {
//        System.out.println(employeeService.findAllStudents());

        for (Student s : employeeService.findAllStudents()) {
            System.out.println(s);
        }
    }

    @Test
    void fname() {
        List<Object[]> objects = employeeService.findfName();

        objects.stream().forEach(o -> System.out.println(o[0] + " " + o[1]));

    }

    @Test
    void findAllstudentsbyfname() {
        System.out.println(employeeService.findAllstudentsbyfname("Amrit"));
    }


//    @Test
//    void delete() {
//        employeeService.deleteById(100);
//    }

    @Test
    @Transactional
    @Rollback(value = false)
    void testDelete(){
        employeeService.deleteStudents("Amrit");
    }

    @Test
    void testPaging(){
        Pageable pageable = new PageRequest();
    }

}
