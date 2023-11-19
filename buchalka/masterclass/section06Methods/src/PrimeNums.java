public class PrimeNums {

    public static int sumAllDivisiblesBy3And5(){
        int sum = 0;
        int count = 0;
        for(int i = 1; count < 5 && i <= 1000; i++){
            if(i % 15 == 0){
                sum += i;
                count++;
            }
        }
        return sum;
    }
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void printPrimes(int start, int finish){
        if(start < 2){
            System.out.println("The start value [" + start + "] should be greater or equal to 2");
        }
        else if(start > finish){
            System.out.println("The finish value [" + finish + "]should be equal or greater than the start [" + start + "] value");
        }
        else {
            for(int i = start; i <= finish; i++){
                System.out.println(i + " is" + (isPrime(i) ? " " : " NOT ") + "a prime number");
            }
        }
    }
}
