package org.example.Q2;

/**
 * Hello world!
 *
 */
public class Main
{
    Employee employee;

    public Main(Object employee) {
        if (employee instanceof Employee) {
            this.employee = (Employee) employee;
        }
    }

    public static void main(String[] args )
    {
        Employee employee1 = new Employee();
       Main main = new Main(employee1);
       main.print();
    }

    void print(){
        System.out.println("Employee id: "+employee.id+"\tEmployee name: "+employee.name);
    }
}
