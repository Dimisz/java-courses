public class PrimeNumber {
    private static boolean isPrime(int num){
       if(num <= 2){
           return (num == 2);
       }
        else{
            for(int i = 2; i <= num / 2; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void printIsPrime(int num){
        System.out.println(num + " is " + (isPrime(num) ? "" : "NOT") + " a prime number");
    }

    public static void countPrimes(int lowerBound, int upperBound){
        if(lowerBound < 0 || upperBound > 1000){
            System.out.println("Should be a positive number from 1 to 1000");
        }
        else if(lowerBound > upperBound){
            System.out.println("Lower bound should be smaller than the upper bound.");
        }
        else {
            int primesCount = 0;
            for(int i = lowerBound; primesCount < 3 && i < upperBound; i++){
                if(isPrime(i)){
                    primesCount++;
                    System.out.println(i);
                }
//                if(primesCount == 3) break;
            }
        }
    }
}
