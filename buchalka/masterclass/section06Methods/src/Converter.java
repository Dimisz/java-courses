public class Converter {
    public static double convertToCentimeters(int inches){
        if(inches < 0) return -1;
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        if(feet < 0 || inches < 0) return -1;
        return convertToCentimeters((feet * 12) + inches);
    }

    public static String getDurationString(int seconds){
        if(seconds < 0) return "Invalid Input";
        int hours  = seconds / 3600;
        int remainingSeconds = seconds - (hours * 3600);
        int minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds - (minutes * 60);
        return hours + "h " + minutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int seconds, int minutes){
        if(seconds < 0 || seconds > 59 || minutes < 0) return "Invalid Input";
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }
}
