public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {6, 5, 4, 3, 2, 1};
        int[] d = {12, -1, 2, 34, -33, 5, 4, 1, 2, 2, 2, 45};
//        Sorting.printIntArray(b);
//        Sorting.sortArray(b);
//        Sorting.printIntArray(b);
        int[] c = Sorting.mySort(d);
        Sorting.printIntArray(c);
    }
}