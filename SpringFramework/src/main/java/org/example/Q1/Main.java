package org.example.Q1;

/**
 * Hello world!
 *
 */
public class Main
{
    Employee employee = new Employee(1,"Amrit");
    public static void main( String[] args )
    {
       Main main = new Main();
       main.print();
    }

    void print(){
        System.out.println("Employee id: "+employee.id+"\tEmployee name: "+employee.name);
    }
}
