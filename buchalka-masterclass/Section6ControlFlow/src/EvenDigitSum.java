public class EvenDigitSum {
    public static int getEvenDigitSum(int num){
        if(num < 0) return -1;
        int sumEvens = 0;
        while(num > 0){
            int digit = num % 10;
//            System.out.println("digit: " + digit);
            if(digit % 2 == 0){
                sumEvens += digit;
            }
//            System.out.println("sumEvens: " + sumEvens);
            num /= 10;
        }
        return sumEvens;
    }
}
