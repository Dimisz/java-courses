public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.setName("Vladimir Solovyov");
        ba1.setEmail("testemail@gmail.com");
        ba1.setAccountNumber("1234-2345-3456-4567");
        ba1.setPhoneNumber("123-2332-1212");
        ba1.deposit(200);
//        System.out.println(ba1);

//        ba1.deposit(0);
//        ba1.deposit(-1);
//        ba1.deposit(0.1);

        ba1.withdraw(400);
        ba1.withdraw(0);
        ba1.withdraw(200.2);
        ba1.withdraw(-1);
        ba1.withdraw(100);
        System.out.println(ba1);
    }
}