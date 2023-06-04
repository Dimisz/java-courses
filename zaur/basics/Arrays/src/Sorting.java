import java.util.Arrays;

public class Sorting {
    public static void sortArray(int [] array){
       Arrays.sort(array);
    }

    public static int[] mySort(int[] array){
        int length = array.length;

        int[] result = array.clone();
//        int currentIndex = 0;
        int temp;

        for(int i = 0; i < length - 1; i++){
            for(int j = 0; j < length - 1; j++){
                if(result[j] > result[j+1]){
                    temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
//            result[i] = currentMin;
        }
        return result;
    }

    public static void printIntArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }


}
