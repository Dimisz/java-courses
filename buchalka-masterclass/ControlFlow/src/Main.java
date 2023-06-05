public class Main {
    public static void main(String[] args) {
        System.out.println("2500 expected: " + SumOdd.sumOdd(1, 100));
        System.out.println("-1 expected: " + SumOdd.sumOdd(-1, 100));
        System.out.println("0 expected: " + SumOdd.sumOdd(100, 100));
        System.out.println("13 expected: " + SumOdd.sumOdd(13, 13));
        System.out.println("-1 expected: " + SumOdd.sumOdd(100, -100));
        System.out.println("247500 expected: " + SumOdd.sumOdd(100, 1000));
    }
}