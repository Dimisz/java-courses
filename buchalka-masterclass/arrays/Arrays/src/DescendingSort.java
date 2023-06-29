import java.util.Arrays;

public class DescendingSort {

    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr, arr.length);

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i + 1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

}
