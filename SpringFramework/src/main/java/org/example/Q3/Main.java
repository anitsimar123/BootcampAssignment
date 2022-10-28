package org.example.Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


/**
 * Hello world!
 *
 */



@Component("m1")
public class Main
{
    @Autowired
    Employee employee;

    @Override
    public String toString() {
        return "Employee\nId: "+employee.getId()+"\nName: "+employee.getName();
    }

    public static void main(String[] args )
    {

       AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

        Main bean = applicationContext.getBean("m1", Main.class);

        System.out.println(bean);

    }
}
