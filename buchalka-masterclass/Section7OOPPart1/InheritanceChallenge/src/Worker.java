import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        LocalDate dateOfBirth = LocalDate.parse(birthDate);
        int yearOfBirth = dateOfBirth.getYear();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;
        System.out.println(age + " years old");
        return age;
    }

    public double collectPay(){
        System.out.println("Collecting pay...");
        return 1000.00;
    }

    public void terminate(){
        System.out.println("Terminating on " + endDate);
    }
}
