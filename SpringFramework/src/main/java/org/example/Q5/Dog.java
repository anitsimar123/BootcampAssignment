package org.example.Q5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dog")
@Primary
public class Dog implements Animal{

    @Override
    public void sound(){
        System.out.println("Sound: Woof-Woof");
    }

    @Override
    public void eat() {
        System.out.println("Eat: Dog food");
    }


    @Override
    public void callAllMethods() {
        eat();
        sleep();
        sound();
    }

}
