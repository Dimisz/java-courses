import java.util.Arrays;

public class ArrayReversal {
    public static int[] reverseArray(int[] arr){
        int[] reversedArray = Arrays.copyOf(arr, arr.length);
        int midpoint = arr.length / 2;
        int temp = 0;
        for(int i = 0; i < midpoint; i++){
            temp = reversedArray[i];
            reversedArray[i] = reversedArray[reversedArray.length - 1 - i];
            reversedArray[reversedArray.length - 1 - i] = temp;
        }
        return reversedArray;
    }
}
