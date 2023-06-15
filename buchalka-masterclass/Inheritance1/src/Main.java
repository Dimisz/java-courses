public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Mike", "1987", "05/05/2025");
        Employee w2 = new Employee("Ann", "1990", "01/01/2024", 123456l, "01/01/2021");

        System.out.println(w1);
        w1.collectPay();
        System.out.println(w1.getAge());
        System.out.println(w2);
    }
}