public class OverloadingMethods {
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters(feet * 12 + inches);
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Seconds (" + seconds + ") should be greater than zero";
        }
        int secondsRemaining = seconds;
        int hours = secondsRemaining / (60 * 60);
        secondsRemaining = secondsRemaining % (60 * 60);
        int minutes = secondsRemaining / 60;
        secondsRemaining = secondsRemaining % 60;
        String result = hours + "h " + minutes + "m " + secondsRemaining + "s";
        return result;
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || minutes > 59){
            return "Minutes (" + minutes + ") should be within the range from 0 to 59";
        }
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }
}
