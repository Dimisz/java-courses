public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0) return false;
        if(smallCount < 0) return false;
        if(goal < 0) return false;

        for(int i = 0; i <= bigCount; i++){
            for(int j = 0; j <= smallCount; j++){
                if(goal - (i * 5) - j == 0){
                    return true;
                }
            }
        }

        return false;
    }
}
