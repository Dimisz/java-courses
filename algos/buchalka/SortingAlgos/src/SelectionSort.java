public class SelectionSort {
    public static void sort(int[] arr){
        int largestNumIndex;
        int currentBiggestNumber;

        for(int i = arr.length - 1; i >= 0; i--){
            largestNumIndex = i;
            for(int j = i; j >= 0; j--){
                if(arr[j] > arr[largestNumIndex]){
                    largestNumIndex = j;
                }
            }
            currentBiggestNumber = arr[largestNumIndex];
            arr[largestNumIndex] = arr[i];
            arr[i] = currentBiggestNumber;
        }
    }
}
