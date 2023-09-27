public class LargestPrime {
    public static int getLargestPrime(int num){
        if(num < 2) return -1;
        int largestPrime = -1;
        for(int i = 2; i <= num; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0) isPrime = false;
            }
            if((num % i == 0) && isPrime) largestPrime = i;
        }
        return largestPrime;
    }
}
