public class SecondsAndMinutes {
    public static void getDurationString(int seconds){
        if(seconds >= 0){
            int hours = 0;
            int minutes = 0;
            int leftSeconds = seconds;

            hours = leftSeconds / 3600;
            leftSeconds = leftSeconds - (hours * 3600);
            minutes = leftSeconds / 60;
            leftSeconds = leftSeconds - (minutes * 60);

            System.out.println(hours + "h " + minutes + "m " + leftSeconds + "s");
        }
        else {
            System.out.println("The value should be a positive number");
        }

    }

    public static void getDurationString(int minutes, int seconds){
        if(minutes < 0){
            System.out.println("Minutes should be a positive number or zero");
        }
        else if(seconds < 0){
            System.out.println("Seconds should be a positive number or zero");
        }
        else {
            int totalSeconds = (minutes * 60) + seconds;
            getDurationString(totalSeconds);
        }
    }
}
