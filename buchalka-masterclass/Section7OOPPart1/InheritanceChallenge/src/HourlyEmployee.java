public class HourlyEmployee extends Employee{
    private double hourlyPayRate;
    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        System.out.println("Base pay rate: " + hourlyPayRate + "$ / h");
        hourlyPayRate *= 2;
        System.out.println("Hourly pay rate doubled:  " + hourlyPayRate + "$ / h");
    }
}
