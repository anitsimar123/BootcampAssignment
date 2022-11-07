package com.SpringJPAHibernateAssignment2.repository;

import com.SpringJPAHibernateAssignment2.entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    @Query("select firstName, lastName from Employee")
    public List<Object[]> getAllEmps();


    //Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @Query("SELECT firstName,lastName FROM Employee WHERE salary >= (SELECT AVG(salary) FROM Employee) ORDER BY age ASC,salary DESC")
    public List<Object[]> JPQLQuery1();


    //Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @Query("SELECT AVG(salary) FROM Employee")
    public double getAvgSal();

    @Modifying
    @Query("UPDATE Employee SET salary =:salary WHERE salary < :avgSalary" )
    public int JPQLQuery2(@Param("salary") double salary,@Param("avgSalary") double avgSalary);

//    @Modifying
//    @Query("UPDATE Employee SET salary =:salary WHERE salary < (SELECT AVG(salary) FROM (SELECT salary FROM Employee) S)")
//    public int JPQLQuery2(@Param("salary") double salary);

//    @Modifying
//    @Query(value = "UPDATE employeeTable SET empSalary =:salary where empSalary < (select avg(empSalary) from (select empSalary from employeeTable) As S)" ,nativeQuery = true)
//    public int nativeQuery0(@Param("salary") double salary);


//    Delete all employees with minimum salary.

    @Query("SELECT MIN(salary) FROM Employee")
    public double getMinSal();

    @Modifying
    @Query("DELETE FROM Employee WHERE salary =:minSalary")
    public int JPQLQuery3(@Param("minSalary") double minSalary);

//    @Modifying
//    @Query("DELETE FROM Employee WHERE salary  = (SELECT MIN(salary) FROM (SELECT salary FROM Employee) AS X)")
//    public int JPQLQuery3();




//    Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value = "SELECT empId,empFirstName,empLastName,empAge FROM employeeTable WHERE empLastName Like('%singh')",nativeQuery = true )
    public List<Object[]> nativeQuery1();

//    Delete all employees with age greater than 45(Should be passed as a parameter)
    @Modifying
    @Query(value = "DELETE FROM employeeTable WHERE empAge >:age",nativeQuery = true)
    public int nativeQuery2(@Param("age") int age);
}
