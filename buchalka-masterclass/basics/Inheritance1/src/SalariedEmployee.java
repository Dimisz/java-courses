public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;
    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        if(this.isRetired){
            System.out.println("The employee is already retired");
        }
        else{
            this.isRetired = true;
            System.out.println("Retiring the employee...");
        }
    }
}
