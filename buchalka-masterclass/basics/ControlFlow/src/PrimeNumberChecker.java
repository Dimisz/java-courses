public class PrimeNumberChecker {
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 1) {
            return (wholeNumber == 2);
        }
        for(int i = 2; i <= wholeNumber / 2; i++){
            if(wholeNumber % i == 0) return false;
        }
        return true;
    }

    public static int primeNumbersInRange(int start, int end){
        if(end <= start){
            System.out.println("Starting value should be less than the end value.");
            return 0;
        }
        else if(end > 1000){
            System.out.println("The end value should be less than or equal to 1000");
            return 0;
        }
        else{
            int count = 0;
            for(int i = start; i <= end; i++){
                if(isPrime(i)){
                    count ++;
                    System.out.println(i + " is a prime number");
//                    if(count == 3) break;
                }
            }
            return count;
        }
    }
}
