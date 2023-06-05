public class SumDigits {
    public static int sumDigits(int num){
        if(num <= 0){
            System.out.println("Please enter a positive number");
            return -1;
        }
        else{
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            System.out.println(sum);
            return sum;
        }
    }
}
