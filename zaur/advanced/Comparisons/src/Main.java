import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(12, "John", "Doe", 200);
        Employee emp4 = new Employee(4, "John", "Aaron", 200);
        Employee emp2 = new Employee(20, "Mary", "Jane", 340);
        Employee emp3 = new Employee(3, "John", "Sullivan", 100);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        System.out.println("Before sorting...");
        System.out.println(employees);

        Collections.sort(employees, new FullNameComparator());
        System.out.println("After sorting...");
        System.out.println(employees);
    }
}