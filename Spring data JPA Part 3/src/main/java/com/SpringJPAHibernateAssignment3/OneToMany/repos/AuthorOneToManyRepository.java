package com.SpringJPAHibernateAssignment3.OneToMany.repos;

import com.SpringJPAHibernateAssignment3.OneToMany.entities.AuthorOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorOneToManyRepository extends JpaRepository<AuthorOneToMany,Integer> {

}
