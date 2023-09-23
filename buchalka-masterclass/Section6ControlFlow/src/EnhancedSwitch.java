public class EnhancedSwitch {
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch(day){
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Wrong input (day value should be from 0 to 6)";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
