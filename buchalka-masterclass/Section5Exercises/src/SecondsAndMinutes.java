public class SecondsAndMinutes {
    public static void getDurationString(int seconds){
        int hours = 0;
        int minutes = 0;
        int leftSeconds = seconds;

        hours = leftSeconds / 3600;
        leftSeconds = leftSeconds - (hours * 3600);
        minutes = leftSeconds / 60;
        leftSeconds = leftSeconds - (minutes * 60);

        System.out.println(hours + "h " + minutes + "m " + leftSeconds + "s");
    }

    public static void getDurationString(int minutes, int seconds){
        int totalSeconds = (minutes * 60) + seconds;
        getDurationString(totalSeconds);
    }
}
