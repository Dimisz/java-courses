public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        if(creditLimit > 0){
            this.creditLimit = creditLimit;
        }
        else{
            this.creditLimit = 0;
        }
        this.email = email;
    }

    public Customer(){
        this("No name provided", 0, "no email provided");
    }

    public Customer(String name, String email){
        this(name, 0, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
