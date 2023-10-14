import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        Employee1 emp1 = new Employee1(1, "John", "Doe", 200);
        Employee1 emp2 = new Employee1(2, "Peter", "Johnson", 300);
        Employee1 emp3 = new Employee1(3, "Mary", "Doe", 250);
        Employee1 emp4 = new Employee1(5, "Zaur", "Anthony", 250);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println("Before sorting...");
        System.out.println(employees);
        System.out.println("After sorting...");
        Collections.sort(employees, new FullNameComparator());
        System.out.println(employees);
    }
}

class Employee1 {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee1(int id, String firstName, String lastName, int salary) {
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
}

class IdComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.firstName.compareTo(emp2.firstName);
    }
}

class FullNameComparator implements Comparator<Employee1>{
    @Override
    public int compare(Employee1 emp1, Employee1 emp2){
        int res = emp1.lastName.compareTo(emp2.lastName);
        if(res == 0){
            res = emp1.firstName.compareTo(emp2.firstName);
        }
        return res;
    }
}
