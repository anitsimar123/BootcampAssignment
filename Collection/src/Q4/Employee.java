package Q4;

public class Employee implements Comparable<Employee>{
    int age;
    String designation;
    String name;

    Employee(String name, int age, String designation){
        this.age=age;
        this.name=name;
        this.designation=designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", designation=" + designation +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }
}
