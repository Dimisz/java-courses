public class ForLoop {
    public static void timer(){
        HOURS: for(int hr = 0; hr < 7; hr++){
            MINS: for(int minute = 0; minute < 60; minute++){
                if(hr > 1 && minute % 10 == 0){
                    break HOURS;
                }
                SECS: for(int sec = 0; sec < 60; sec++){
                    if(sec * hr > minute){
                        continue;
                    }
                    else {
                        System.out.println(
                                "0" +hr + ":" +
                                        (minute > 9 ? minute : "0" + minute)
                                        + ":" + (sec > 9 ? sec : "0" + sec));
                    }
                }
            }
        }
    }
}
