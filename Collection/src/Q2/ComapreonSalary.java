package Q2;

import java.util.Comparator;

public class ComapreonSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary.compareTo(e2.salary);
    }
}
