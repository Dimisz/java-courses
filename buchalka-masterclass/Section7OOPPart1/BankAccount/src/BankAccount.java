public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        if(balance < 0){
            this.balance = 0;
        }
        else {
            this.balance = balance;
        }
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(double amount){
        if(amount <= 0){
            System.out.println("Amount to deposit must be greater than 0.");
        }
        else{
            this.balance += amount;
            System.out.println("Deposited $" + amount + ".");
            System.out.println("Current balance is $" + this.balance + ".");
        }
    }

    public void withdrawFunds(double amount){
        if(amount <= 0){
            System.out.println("Amount to withdraw must be greater than 0.");
        }
        else if(this.balance - amount < 0){
            System.out.println("You don't have sufficient funds to withdraw $" + amount + "." );
        }
        else {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + ".");
            System.out.println("Current balance is $" + this.balance + ".");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
