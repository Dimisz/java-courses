public class Main {
    public static void main(String[] args) {
        System.out.println("0: error " + PrimeNumberChecker.isPrime(0));
        System.out.println("1: error " + PrimeNumberChecker.isPrime(1));
        System.out.println("3: true " + PrimeNumberChecker.isPrime(3));
        System.out.println("5: true " + PrimeNumberChecker.isPrime(5));
        System.out.println("6: false " + PrimeNumberChecker.isPrime(6));
    }
}