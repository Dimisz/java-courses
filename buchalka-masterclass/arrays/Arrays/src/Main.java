public class Main {
    public static void main(String[] args) {
      int[] nums = SortingInput.getIntegers(5);
      SortingInput.printArray(nums);
      int[] sortedArray = SortingInput.sortIntegers(nums);
      SortingInput.printArray(sortedArray);
    }
}