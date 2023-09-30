public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("1234-1234", 230.99, "Vladimir Solovyov", "test@mail.com", "123-2323-3232");
        System.out.println(ba1.getBalance());
        ba1.depositFunds(-23);
        System.out.println(ba1.getBalance());
        ba1.depositFunds(20);
        System.out.println(ba1.getBalance());
        ba1.withdrawFunds(-1);
        System.out.println(ba1.getBalance());
        ba1.withdrawFunds(1000);
        System.out.println(ba1.getBalance());
        ba1.withdrawFunds(100);
        System.out.println(ba1.getBalance());
    }
}