public class SharedDigits {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
//            System.out.println("Invalid input - false");
            return false;
        }
        else{
            while(num1 > 0){
                int digit = num1 % 10;
                int temp = num2;
                while(temp > 0){
                    if(digit == temp % 10){
//                        System.out.println("Digit " + digit + " is shared");
                        return true;
                    }
                    temp /= 10;
                }
                num1 /= 10;
            }
//            System.out.println("false");
            return false;
        }
    }
}
