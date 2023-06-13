public class BankAccount {
    private String name;
    private String accountNumber;
    private String phoneNumber;
    private String email;
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Depositing $" + amount + "...");
            System.out.println("Current balance: $" + this.getBalance());
        }
        else {
            System.out.println("Deposit amount should be greater than 0. You entered: " + amount + ".");
        }
    }

    public void withdraw(double amount){
        if(amount > 0){
            if(this.balance - amount >= 0){
                this.balance -= amount;
                System.out.println("Withdrawing $" + amount + "...");
                System.out.println("Remaining balance is $" + this.getBalance());
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
        else {
            System.out.println("Withdrawal amount should be greater than 0. You entered: " + amount + ".");
        }
    }
    public double getBalance(){
        return this.balance;
    }

    public void setEmail(String email){
        if(email.strip() != ""){
            this.email = email;
        }
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.strip() != ""){
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setName(String name){
        if(name.strip() != ""){
            this.name = name;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setAccountNumber(String accountNumber){
        if(accountNumber.strip() != ""){
            this.accountNumber = accountNumber;
        }
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    @Override
    public String toString(){
        return "Account number:\t" + this.getAccountNumber() +
                "\nAccount holder:\t" + this.getName() +
                "\nPhone number:\t" + this.getPhoneNumber() +
                "\nEmail:\t" + this.getEmail() +
                "\nCurrent balance:\t$" + this.getBalance();
    }
}
