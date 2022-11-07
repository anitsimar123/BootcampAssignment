package com.SpringJPAHibernateAssignment3.OneToOne.repos;

import com.SpringJPAHibernateAssignment3.OneToOne.entities.AuthorOneToOne;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToOneRepository extends CrudRepository<AuthorOneToOne,Integer> {

}
