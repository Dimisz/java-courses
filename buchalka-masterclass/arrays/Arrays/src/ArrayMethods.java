import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
    public static void main(String[] args) {
//        int[] arr = getRandomArray(10);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int[] secondArray = new int[10];
//        Arrays.fill(secondArray, 3);
//        System.out.println(Arrays.toString(secondArray));
//
//        int[] thirdArray = new int[10];
//        System.out.println(Arrays.toString(thirdArray));
//
//        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
//        System.out.println(Arrays.toString(fourthArray));
        int[] arr = getRandomArray(11);
        System.out.println(Arrays.toString(arr));
        int[] revArr = reverseCopy(arr);
        System.out.println(Arrays.toString(revArr));
    }
    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static int[] reverseArray(int[] arr){
        int[] resultArray = Arrays.copyOf(arr, arr.length);

        System.out.println("Before reversing:");
        System.out.println(Arrays.toString(resultArray));

        int maxIndex = resultArray.length - 1;
        int halfLength = resultArray.length / 2;

        for(int i = 0; i < halfLength; i++){
            int temp = resultArray[maxIndex - i];
            resultArray[maxIndex - i] = resultArray[i];
            resultArray[i] = temp;
        }
        System.out.println("After reversing...");
        System.out.println(Arrays.toString(resultArray));
        return resultArray;
    }

    public static int[] reverseCopy(int[] arr){
        int[] reversedArray = new int[arr.length];
        int maxIndex = arr.length - 1;
        for(int element : arr){
            reversedArray[maxIndex--] = element;
        }
        return reversedArray;
    }

}
