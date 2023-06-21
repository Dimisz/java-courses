public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = { 20, 35, -15, 7, 55, 1, -22 };
        BubbleSort.printArray(arr2);
//        BubbleSort.sort(arr2);
        BubbleSort.instructorSort(arr2);
        BubbleSort.printArray(arr2);
    }
}