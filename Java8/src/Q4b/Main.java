package Q4b;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> l1 = new ArrayList<>();

        l1.add(new Employee("Amritpal Singh", 4500L,"New Delhi"));
        l1.add(new Employee("Amritpal Singh Sethi", 3500L,"New Delhi"));
        l1.add(new Employee("Aarush Goel", 4000L,"Assam"));
        l1.add(new Employee("Sagar Choudhary", 4500L,"New Delhi"));
        l1.add(new Employee("Sagar Sharma", 3400L,"New Delhi"));
        l1.add(new Employee("Vijit Tiwari", 5600L,"Maharashtra"));
        l1.add(new Employee("Keshav Mahur", 6800L,"Goa"));

        l1 = l1.stream()
                .filter(e->e.getSalary()<5000L).filter(e->e.getCity().equals("New Delhi")).distinct()
                .collect(Collectors.toList());

        for(Employee e: l1){
            System.out.println(e);
        }
    }
}
