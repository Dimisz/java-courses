import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparation {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(1, "John", "Doe", 200);
        Employee emp2 = new Employee(2, "Peter", "Johnson", 300);
        Employee emp3 = new Employee(3, "Mary", "Doe", 250);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Before sorting...");
        System.out.println(employees);
        System.out.println("After sorting...");
        Collections.sort(employees);
        System.out.println(employees);

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp){
//        if(this.id == emp.id) return 0;
//        if(this.id > emp.id) return 1;
//        return -1;
        return this.firstName.compareTo(emp.firstName);
    }
}
