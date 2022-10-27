package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<Employee> l1 = new ArrayList<>();
     Employee e1 = new Employee(30,40000.00,"Elon Musk");
     Employee e2 = new Employee(23,34000.00,"Amritpal Singh");
     Employee e3 = new Employee(45,4000.00,"Saurav Ganguli");
     Employee e4 = new Employee(38,24000.00,"Naresh Bansal");
     Employee e5 = new Employee(26,54000.00,"Harshad Mehta");


     l1.add(e1);
     l1.add(e2);
     l1.add(e3);
     l1.add(e4);
     l1.add(e5);

        Collections.sort(l1);

        System.out.println("Sorting on bases of Name");
        for(Employee e: l1){
            System.out.println(e);
        }


        Collections.sort(l1,new ComapreonSalary());

        System.out.println("Sorting on bases of Salary");
        for(Employee e: l1){
            System.out.println(e);
        }

    }
}