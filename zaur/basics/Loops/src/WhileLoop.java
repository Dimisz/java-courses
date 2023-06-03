public class WhileLoop {
    public static void timer(){
        int hr = 0;
        HOURS:
        while(hr < 7){
            int minute = 0;
            MINS:
            while(minute < 60){
                if(hr > 1 && minute % 10 == 0){
                    System.out.println("Breaking out");
                    break HOURS;
                }
                int sec = 0;

                do{
//                    if(sec * hr > minute){
//                        continue;
//                    }
//                    else {
                        System.out.println(
                                "0" +hr + ":" +
                                        (minute > 9 ? minute : "0" + minute)
                                        + ":" + (sec > 9 ? sec : "0" + sec));
//                    }
                    sec++;
                } while(sec < 60);
//                System.out.println("0" + hr + ":" + minute);
                minute++;
            }
            hr++;
        }
        System.out.println("finihed");
    }
}
