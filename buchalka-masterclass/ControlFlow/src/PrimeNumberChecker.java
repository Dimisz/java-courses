public class PrimeNumberChecker {
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 1) {
            System.out.println("Wrong input: " + wholeNumber + ". Number should be greater than 1.");
            return false;
        }
        for(int i = 2; i < wholeNumber; i++){
            if(wholeNumber % i == 0) return false;
        }
        return true;
    }
}
