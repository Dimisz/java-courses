import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = MinElement.readIntegers();
        System.out.println(Arrays.toString(nums));
        int minNumber = MinElement.findMin(nums);
        System.out.println(minNumber);
    }
}