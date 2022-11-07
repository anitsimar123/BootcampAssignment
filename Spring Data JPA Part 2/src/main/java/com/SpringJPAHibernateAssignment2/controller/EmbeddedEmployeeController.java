package com.SpringJPAHibernateAssignment2.controller;

import com.SpringJPAHibernateAssignment2.entities.EmbeddedEmployee;
import com.SpringJPAHibernateAssignment2.service.EmbeddedEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmbeddedEmployeeController {
    @Autowired
    EmbeddedEmployeeService embeddedEmployeeService;

    @PostMapping("/embeddedEmployee")
    public EmbeddedEmployee createEmbeddedEmployee(@RequestBody EmbeddedEmployee embeddedEmployee){
        return embeddedEmployeeService.createEmbeddedEmployee(embeddedEmployee);
    }


}
