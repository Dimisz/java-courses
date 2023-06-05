public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2){
        if(num1 < 10 || num2 < 10){
//            System.out.println("Invalid input");
            return -1;
        }
        else{
            for(int i = num1; i > 0; i--){
                if(num1 % i == 0 && num2 % i == 0){
//                    System.out.println(i);
                    return i;
                }
            }
        }
//        System.out.println("Not found");
        return -1;
    }
}
