package org.example.Q5;


import org.springframework.stereotype.Component;


@Component("cat")
public class Cat implements Animal{

    @Override
    public void sound(){
        System.out.println("Sound: Meow-Meow");
    }

    @Override
    public void eat() {
        System.out.println("Eat: Cat food");
    }

    @Override
    public void callAllMethods() {
     eat();
     sleep();
     sound();
    }


}
