package org.example.Q4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */


public class Main
{

    public static void main(String[] args )
    {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Employee employeeBean = applicationContext.getBean("e1", Employee.class);

        System.out.println(employeeBean);
    }
}
