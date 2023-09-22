public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            int years = (int) (minutes / (60 * 24 * 365));
            long remainingMinutes = minutes % (60 * 24 * 365);
            int days = (int) (remainingMinutes / (60 * 24));
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
