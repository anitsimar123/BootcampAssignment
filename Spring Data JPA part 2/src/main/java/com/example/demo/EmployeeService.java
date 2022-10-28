package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

public interface EmployeeService extends CrudRepository<Student, Integer> {
    @Query("from Student")
    List<Student> findAllStudents();

    @Query("select st.fname,st.lname from Student st")
    List<Object[]> findfName();


    @Query("from Student where fname=:firstname")
    List<Student> findAllstudentsbyfname(@Param("firstname") String firstName);

//    @Query("from Student where ")
//    findByscores();

    @Modifying
    @Query(value = "delete from student where id=:Id", nativeQuery = true)
    void deleteStudents(@Param("Id") Integer id);

    public void deleteById(Integer id);

    @Modifying
    @Query("delete from Student where fname=:firstname")
    void deleteStudents(@Param("firstname") String firstName);


}
