public class MinutesToYears {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long remainingMins = minutes;
            long years = remainingMins / (60 * 24 * 365);
            remainingMins = remainingMins - (years * 60 * 24 * 365);
            long days  = remainingMins / (60 * 24);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
