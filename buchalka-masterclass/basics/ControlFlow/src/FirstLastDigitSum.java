public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num){
        if(num < 0) {
//            System.out.println(-1);
            return -1;
        }
        else {
            int sum = num % 10;
            while (num > 9) {
                num /= 10;
            }
            sum += num;
//            System.out.println(sum);
            return sum;
        }
    }
}
