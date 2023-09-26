public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int num){
        if(num < 0) return -1;
        int sum = num % 10;
        while(num > 9){
            num /= 10;
        }
        return sum + num;
    }
}
