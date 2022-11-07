package com.SpringJPAHibernateAssignment2.repository;

import com.SpringJPAHibernateAssignment2.entities.EmbeddedEmployee;
import org.springframework.data.repository.CrudRepository;

public interface EmbeddedEmployeeRepository extends CrudRepository<EmbeddedEmployee,Integer> {

}
