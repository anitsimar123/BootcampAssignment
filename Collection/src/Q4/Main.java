package Q4;

import Q2.ComapreonSalary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
     Map<Employee,Integer> m1 = new HashMap<>();

     Employee e1 = new Employee("Amritpal Singh",23,"Software Engineer");
     Employee e2 = new Employee("Elon Musk", 56, "CEO");
     Employee e3 = new Employee("Aarush Goel",23,"Software Tester");
     Employee e4 = new Employee("Sagar Sharma",34, "Software Tester");

     m1.put(e1,45000);
     m1.put(e2,34000);
     m1.put(e3,32000);
     m1.put(e4,25000);

     for(Map.Entry<Employee,Integer> m: m1.entrySet()){
         System.out.println(m.getKey()+" - "+m.getValue());
     }
    }
}