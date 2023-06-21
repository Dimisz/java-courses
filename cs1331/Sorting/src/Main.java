public class Main {
    public static void main(String[] args) {
        int[] nums = { 3, 9, 6, 1, 2 };
        System.out.println("Before sorting...");
        printArray(nums);
        SelectionSort.sort(nums);
        System.out.println("After sorting");
        printArray(nums);
    }

    public static void printArray(int[] arr){
        System.out.print("[ ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }
}