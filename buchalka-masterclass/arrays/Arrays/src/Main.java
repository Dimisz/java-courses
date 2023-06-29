public class Main {
    public static void main(String[] args) {
//      int[] nums = SortingInput.getIntegers(5);
//      SortingInput.printArray(nums);
//      int[] sortedArray = SortingInput.sortIntegers(nums);
//      SortingInput.printArray(sortedArray);
        int[] nums = MinElement.readIntegers(1, 2, 3, -11, 5);
        int num = MinElement.findMin(nums);
        System.out.println(num);
    }
}