import java.util.Comparator;

public class FullNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2){
        int res = emp1.getFirstName().compareTo(emp2.getFirstName());
        if(res == 0){
            res = emp1.getLastName().compareTo(emp2.getLastName());
        }
        return res;
    }
}
