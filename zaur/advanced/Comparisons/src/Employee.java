public class Employee implements Comparable<Employee> {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

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
    public int compareTo(Employee otherEmployee){
//        return otherEmployee.id - this.id;
        int res = this.firstName.compareTo(otherEmployee.firstName);
        if(res == 0){
            res = this.lastName.compareTo(otherEmployee.lastName);
        }
        return res;
    }

}
