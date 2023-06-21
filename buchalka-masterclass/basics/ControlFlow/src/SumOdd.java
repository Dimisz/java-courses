public class SumOdd {
    public static boolean isOdd(int num){
        if(num > 0 && num % 2 == 1) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if(start <= 0 || end <=0 || end < start){
            return -1;
        }
        else{
            int sum = 0;
            for(int i = start; i <= end; i++){
                sum += (isOdd(i) ? i : 0);
            }
            return sum;
        }
    }
}
