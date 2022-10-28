package org.example.Q5;

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
    Animal animal;

   void printMethodsOfAnimal(){
       animal.callAllMethods();
   }

    public static void main(String[] args )
    {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Main bean = applicationContext.getBean("m1", Main.class);
       bean.printMethodsOfAnimal();

    }
}
