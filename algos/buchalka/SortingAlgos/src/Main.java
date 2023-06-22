public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = { 20, 35, -15, 7, 55, 1, -22 };
        printArray(arr2);
//        BubbleSort.sort(arr2);
//        SelectionSort.sort(arr2);
        MergeSort.sort(arr2);
        printArray(arr2);
    }

    public static void printArray(int[] arr){
        System.out.print("[ ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }
}