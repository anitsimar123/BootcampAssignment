package Q2;

public class Employee implements Comparable<Employee>{
    int age;
    Double salary;
    String name;

    Employee(int age, Double salary, String name){
        this.age=age;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Q2.Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}'+"\n";
    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }
}
