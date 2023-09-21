public class Main {
    public static void main(String[] args) {
        System.out.print("false -> ");
        System.out.println(LeapYearCalculator.isLeapYear(-1600));
        System.out.print("true -> ");
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.print("false -> ");
        System.out.println(LeapYearCalculator.isLeapYear(2017));
        System.out.print("true -> ");
        System.out.println(LeapYearCalculator.isLeapYear(2000));
    }
}