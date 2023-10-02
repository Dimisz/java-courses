public class Main {
    public static void main(String[] args) {
        SalariedEmployee se = new SalariedEmployee("Mike", "1987-08-23", "2024-01-01", 123321l,"2021-10-10", 60000.00, false);
        se.getAge();
        se.terminate();
        se.collectPay();
        se.retire();

        HourlyEmployee he = new HourlyEmployee("John", "1994-09-20", "2026-10-01", 23232323l, "2020-12-12", 12);
        he.getAge();
        he.terminate();
        he.collectPay();
        he.getDoublePay();
    }
}