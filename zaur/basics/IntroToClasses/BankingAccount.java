public class BankingAccount {
  String name = "Not specified";
  double balance = 0.0;

  BankingAccount(String name, double initialBalance) {
    this.name = name;
    this.balance = initialBalance;
  }

  void addFunds(double amount) {
    System.out.println("Adding " + amount + "$...");
    this.balance += amount;
  }

  void withdrawFunds(double amount) {
    if (this.balance - amount >= 0) {
      System.out.println("Withdrawing " + amount + "$...");
      this.balance -= amount;
    } else {
      System.out.println("Insuffiecient funds. Withdrawal forbidden");
    }
  }

  void showBalance() {
    System.out.println("Current balance: " + this.balance);
  }

  void printInfo() {
    System.out.println("Account holder:\t" + this.name + "\nAccount balance:\t" + this.balance);
  }

  public static void main(String[] args) {
    BankingAccount account1 = new BankingAccount("Vladimir Solovyov", 0);
    account1.printInfo();
    account1.withdrawFunds(100);
    account1.showBalance();
    account1.addFunds(435.55);
    account1.printInfo();
    account1.withdrawFunds(120);
    account1.showBalance();
  }
}
