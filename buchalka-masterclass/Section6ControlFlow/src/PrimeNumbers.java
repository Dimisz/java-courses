public class PrimeNumbers {
    public static boolean isPrime(int num){
        if(num <= 2) return num == 2;
        for(int i = 2; i < num - 1; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void printPrimes(int lowerBound, int upperBound, int howMany){
        if(upperBound < lowerBound){
            System.out.println("Lower bound (" + lowerBound +
                    ") should be less than upper bound (" +
                    upperBound + ").");
        }
        else if(lowerBound < 1){
            System.out.println("Invalid input (" + lowerBound + "). Only numbers equal or greater than 1 can be prime");
        }
        else {
            int count = 0;
            for(int i = lowerBound; i <= upperBound; i++){
                if(isPrime(i)){
                    count++;
                    System.out.println(i + " is a prime number");
                    if(count == howMany) break;
                }
            }
        }
    }
}
