public class Main {
    public static void main(String[] args) {

        int[] a = Sorting.getIntegers(5);
        Sorting.printArray(a);
        System.out.println("After sorting...");
        int[] aSorted = Sorting.sortIntegers(a);
        Sorting.printArray(aSorted);
    }
}