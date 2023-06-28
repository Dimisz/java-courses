import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = getRandomArray(10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 3);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = new int[10];
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
    }
    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
