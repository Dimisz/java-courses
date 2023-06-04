public class Main {
    public static void main(String[] args) {
//        System.out.println("-1600: " + LeapYear.isLeapYear(-1600));
//        System.out.println("1600: " + LeapYear.isLeapYear(1600));
//        System.out.println("2017: " + LeapYear.isLeapYear(2017));
//        System.out.println("2000: " + LeapYear.isLeapYear(2000));
        System.out.println("31: " + LeapYear.getDaysInMonth(1, 2020));
        System.out.println("29: " + LeapYear.getDaysInMonth(2, 2020));
        System.out.println("28: " + LeapYear.getDaysInMonth(2, 2021));
        System.out.println("28: " + LeapYear.getDaysInMonth(2, 2018));
        System.out.println("-1 " + LeapYear.getDaysInMonth(-1, 2020));
        System.out.println("-1 " + LeapYear.getDaysInMonth(1, -2020));
    }
}