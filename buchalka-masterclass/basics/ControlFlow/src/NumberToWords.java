public class NumberToWords {
    public static int getDigitCount(int num){
        if(num < 0){
//            System.out.println("Invalid input");
            return -1;
        }
        else if(num == 0){
//            System.out.println(1);
            return 1;
        }
        else{
            int count = 0;
            while(num > 0){
                count++;
                num /= 10;
            }
//            System.out.println(count);
            return count;
        }
    }

    public static int reverse(int num){
        int sign = (num >= 0 ? 1 : -1);
        int absNum = Math.abs(num);
        int result = 0;
        while(absNum != 0){
            result *= 10;
            result += absNum % 10;
            absNum /= 10;
        }
//        System.out.println(result * sign);
        return result * sign;
    }

    public static void numberToWords(int num){
        int numDigits = getDigitCount(num);
        if(numDigits > 0){
            int reversedNum = reverse(num);
            int count = 0;
            while(reversedNum > 0){
                count++;
                int singleDigit = reversedNum % 10;
                switch (singleDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("SOMETHING'S WRONG.");
                        break;
                }
                reversedNum /= 10;
            }
            if(numDigits > count){
                for(int i = 0; i < (numDigits - count); i++){
                    System.out.println("Zero");
                }
            }
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}
