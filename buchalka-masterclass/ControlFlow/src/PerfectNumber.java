public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        if(num < 1){
//            System.out.println("Invalid input");
            return false;
        }
        else{
            int sumOfDivisors = 0;
            for(int i = (num - 1); i > 0; i--){
                if(num % i == 0){
                    sumOfDivisors += i;
                }
            }

//            System.out.println(sumOfDivisors == num);
            return sumOfDivisors == num;
        }
    }
}
