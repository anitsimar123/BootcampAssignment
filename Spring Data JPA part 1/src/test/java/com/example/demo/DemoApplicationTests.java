package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    List<Employee> employeeList = new ArrayList();

    List<Employee> ListEmployee(){
      Employee e2 = new Employee(2,"Rakesh",26,"Gurugram");
      Employee e3 = new Employee(3,"Sagar",24,"Faridabad");
      Employee e4 = new Employee(4,"Salman",23,"Noida");
      Employee e5 = new Employee(5,"Aarush",30,"Nainital");

      employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;
    }

    @Test
   void test_create_employee(){
    Employee e1 = new Employee();

    e1.setAge(23);
        e1.setLocation("Delhi");
    e1.setName("Amrit");

    employeeRepository.save(e1); //Insert

}

    @Test
    void create_multiple_employee(){
        ListEmployee();  // Insert
        employeeRepository.saveAll(employeeList);

    }

    @Test
    void testRead(){
        System.out.println(employeeRepository.findAll());
    }

 @Test
    void test_read_by_id(){
     Employee byId = employeeRepository.findById(1).get();
     System.out.println(byId);
 }

 @Test
    void testUpdate(){
     Employee employee = employeeRepository.findById(4).get();
     employee.setAge(18);
     employee.setName("Harshad");
     employeeRepository.save(employee); //Update
 }

 @Test
    void testDelete(){
        if(employeeRepository.existsById(3)) {
            employeeRepository.deleteById(3);
        }
 }

 @Test
    void testCount(){
     System.out.println("Total records in database: "+employeeRepository.count());
 }
 @Test
    void testFindByName(){
     List<Employee> amrit = employeeRepository.findByName("Amrit");
     System.out.println(amrit);
 }

    @Test
    void testFindByNameAndLocation(){
        List<Employee> amrit = employeeRepository.findByNameAndLocation("Amrit","Delhi");
        System.out.println(amrit);
    }


    @Test
    void testFindByAgeBetween(){
        List<Employee> byAgeBetween = employeeRepository.findByAgeBetween(28, 32);
        byAgeBetween.stream().forEach(System.out::println);
    }

    @Test
    void testFindByNameLike(){
        List<Employee> byNameLike = employeeRepository.findByNameLike("A%");
        byNameLike.stream().forEach(System.out::println);

    }

//    @Test
//    void testPaging(){
//        Pageable pageable =  PageRequest.of(0,1,Sort.by(Sort.Direction.ASC,"age"));
//        Page<Employee> all = employeeRepository.findAll(pageable);
//        all.forEach(System.out::println);
//    }

    @Test
    void testPaging(){
//        Page<Employee> all = employeeRepository.findAll(PageRequest.of(1, 2));
//        all.forEach(System.out::println);

//        Page<Employee> all = employeeRepository.findAll(PageRequest.of(0, 2, Sort.by("age")));
//        all.forEach(System.out::println);

//        Page<Employee> age = employeeRepository.findAll(PageRequest.of(0, 2, Sort.by("age").descending()));
//        age.forEach(System.out::println);

//        Page<Employee> age = employeeRepository.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "age"));
//        age.forEach(System.out::println);
    }


//    @Test
//    public void testSorting(){
//        employeeRepository.findAll(Sort.by("age"));
//        employeeRepository.findAll(Sort.by(Sort.Direction.DESC,"age"));
//        employeeRepository.findAll(Sort.by(Sort.Order.by("name")));

//        Iterable<Employee> all = employeeRepository.findAll(Sort.by(Sort.Order.asc("name"), Sort.Order.desc("age")));
//       all.forEach(System.out::println);
//    }


    @Test
    public void testGetAll(){
        employeeRepository.getAll(PageRequest.of(0,2, Sort.Direction.ASC,"age")).forEach(System.out::println);
    }

    @Test
    public void testGetByNameAndLocation(){
        employeeRepository.getByNameAndLoc("Amrit","Noida",PageRequest.of(0,3)).forEach(System.out::println);
    }

    @Test
    public void testGetAllUsersNativeQuery(){
        employeeRepository.getAllEmployee().forEach(System.out::println);
    }

    @Test
    public void testGetAllUsersByNameAndLocNativeQuery(){
        employeeRepository.getByNameAndLocNative("Amrit","Noida").forEach(System.out::println);
    }

    @Test
    public void testGetAllUsersByAgeBetweenNativeQuery(){
        employeeRepository.getAgeInBetween(20,25,PageRequest.of(0,2,Sort.by(Sort.Order.desc("age")))).forEach(System.out::println);
    }

    @Test
    @Rollback(value = false)
    public void testDeleteQuery(){
        employeeRepository.deleteQuery("Amrit");
    }
}
