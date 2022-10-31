package com.example.demo4.Controller;

import com.example.demo4.Dao.Employee;
import com.example.demo4.DaoService.EmployeeService;
import com.example.demo4.Exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Set;

//@Controller
//@ResponseBody
@RestController
public class MainController {

    @Autowired
    private EmployeeService employeeService;

    public MainController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //    @RequestMapping(path = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String home() {
        return "Welcome to SpringBoot";
    }

    @GetMapping("/employees")
    public ResponseEntity<Set<Employee>> students() {
        if (employeeService.findAll().isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

            throw new RuntimeException();
        }
//        return ResponseEntity.of(Optional.of(employeeService.findAll()));
        return ResponseEntity.ok().body(employeeService.findAll());
    }

    @GetMapping("/employees/{id}")
    public Employee studentsPathVariable(@PathVariable("id") int id) {

        Employee emp = employeeService.findById(id);

        if (emp == null) {
            throw new UserNotFoundException("id: " + id);
        }

        return emp;
    }

    @PostMapping("/employees")
    public ResponseEntity createUsers(@Valid @RequestBody Employee user) {
        Employee e = employeeService.addUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(e.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity delete(@PathVariable("id") int id) {
        if (!employeeService.findById(id).equals(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            employeeService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }

    @PutMapping("/employees/{id}")
    public void updateById(@RequestBody Employee user, @PathVariable int id) {
        employeeService.updateUserById(user, id);
    }

}
