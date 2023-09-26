public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10) return -1;
        if(second < 10) return -1;
        int smaller = first < second ? first : second;
        int currentDivisor = -1;
        for(int i = 1; i <= smaller; i++){
            if(first % i == 0 && second % i == 0){
                currentDivisor = i;
            }
        }
        return currentDivisor;
    }
}
