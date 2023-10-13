import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] initialArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(initialArray));
        int[] reversed = ArrayReversal.reverseArray(initialArray);
        System.out.println(Arrays.toString(reversed));

    }
}