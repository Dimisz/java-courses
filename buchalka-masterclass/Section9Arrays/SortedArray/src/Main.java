import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = Sorting.generateRandomArray(5);
        System.out.println(Arrays.toString(a));
        int[] aSorted = Sorting.sortIntArray(a);
        System.out.println(Arrays.toString(aSorted));
        int[] aReversed = Sorting.reverseArray(aSorted);
        System.out.println(Arrays.toString(aReversed));
    }
}