package Q4b;

import java.util.Objects;

public class Employee {
    String fullName;
    Long salary;
    String city;

    String[] fName;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
        fName = fullName.split(" ");
    }

    @Override
    public boolean equals(Object o) {

        return fName[0].equals(((Employee)o).fName[0]);
    }

    @Override
    public int hashCode() {
        return 1;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}
