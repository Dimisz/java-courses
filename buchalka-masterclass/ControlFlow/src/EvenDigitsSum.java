public class EvenDigitsSum {
    public static int getEvenDigitSum(int num){
        if(num < 0){
//            System.out.println(-1);
            return -1;
        }
        else {
            int sum = 0;
            while(num > 0){
                int digit = num % 10;
                if(digit % 2 == 0){
                    sum += digit;
                }
                num /= 10;
            }
//            System.out.println(sum);
            return sum;
        }
    }
}
