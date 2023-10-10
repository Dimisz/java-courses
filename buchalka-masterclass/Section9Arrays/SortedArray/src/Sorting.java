import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static int[] generateRandomArray(int len){
        Random random = new Random();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = random.nextInt(0, 100);
        }
        return arr;
    }

    public static int[] sortIntArray(int[] arr){
        int[] arrayToSort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrayToSort);
        return arrayToSort;
    }

    public static int[] reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }
}
