public class NumberToWords {
    public static int reverse(int num){
        int absNum = Math.abs(num);
        int reversedNum = 0;
        while(absNum > 0){
            reversedNum *= 10;
            reversedNum += absNum % 10;
            absNum /= 10;
        }
        return (num >= 0) ? reversedNum : -reversedNum;
    }

    public static int getDigitCount(int num){
        if(num < 0) return -1;
        int count = 1;
        while(num > 9){
            count++;
            num /= 10;
        }
        return count;
    }

    public static void numberToWords(int num){
        if(num < 0){
            System.out.println("Invalid Value");
        }
        else {
            int numbersPrinted = 0;
            int reversedNum = reverse(num);
            while(reversedNum > 0){
                numbersPrinted++;
                int numToPrint = reversedNum % 10;
                switch(numToPrint){
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
                        System.out.println("Invalid Value");
                        break;
                }
                reversedNum /= 10;
            }
            int digitsToPrint = getDigitCount(num);
            if(numbersPrinted < digitsToPrint){
                int digitsRemaining = digitsToPrint - numbersPrinted;
                for(int i = 0; i < digitsRemaining; i++){
                    System.out.println("Zero");
                }
            }
        }
    }
}
