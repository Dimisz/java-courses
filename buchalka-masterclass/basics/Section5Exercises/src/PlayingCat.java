public class PlayingCat {
    public static boolean isCatPlaying(boolean isSummer, int temperature){
        if(temperature < 25){
            return false;
        }
        else{
            if(isSummer && temperature <= 45){
                return true;
            }
            else if(temperature <= 35){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
