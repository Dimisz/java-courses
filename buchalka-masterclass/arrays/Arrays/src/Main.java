import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] randomArray = ArrayMethods.getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));

        int[] sortedArray = DescendingSort.sortIntegers(randomArray);
        System.out.println(Arrays.toString(sortedArray));
    }
}