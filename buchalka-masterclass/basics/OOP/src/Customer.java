public class Customer {
    private String name;
    private double creditLimit;
    private String address;

    // constructors
    public Customer(String name, String address, double creditLimit){
        this.name = name;
        this.address = address;
        this.creditLimit = creditLimit;
        System.out.println("Running the three args constructor...");
    }

    public Customer(){
        this("Unknown name", "Probably homeless", 0.0);
        System.out.println("Running no args constructor...");
    }

    public Customer(String name, String address){
        this(name, address, 0.0);
        System.out.println("Running a two arg constructor...");
    }
    // getters
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    @Override
    public String toString(){
        return "\n========================\n" +
                "Customer name:\t" + this.getName() +
                "\nAddress:\t" + this.getAddress() +
                "\nCredit Limit:\t" + this.getCreditLimit() +
                "\n=========================\n";
    }
}
