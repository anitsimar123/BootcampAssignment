package org.example.Q5;

public interface Animal {

    default void eat(){
        System.out.println("Eat: food");
    }

    default void sleep(){
        System.out.println("Sleep: At night");
    }

    public void sound();

    public void callAllMethods();
}
