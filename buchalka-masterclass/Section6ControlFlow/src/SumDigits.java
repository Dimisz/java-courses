public class SumDigits {
    public static int sumDigits(int num){
        if(num < 0) return -1;
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
