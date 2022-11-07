package com.SpringJPAHibernateAssignment2.service;

import com.SpringJPAHibernateAssignment2.repository.EmbeddedEmployeeRepository;
import com.SpringJPAHibernateAssignment2.entities.EmbeddedEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmbeddedEmployeeService {

    @Autowired
    EmbeddedEmployeeRepository embeddedEmployeeRepository;


    public EmbeddedEmployee createEmbeddedEmployee(EmbeddedEmployee employee) {
        return embeddedEmployeeRepository.save(employee);
    }
}
