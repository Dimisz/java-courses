import java.util.Arrays;
import java.util.Scanner;

public class SortingInput {
    public static int[] getIntegers(int len){
        int[] userArray = new int[len];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < len; i++){
            userArray[i] = scanner.nextInt();
        }
        return userArray;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    flag = true;
                    temp = sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return sortedArray;
    }
}
