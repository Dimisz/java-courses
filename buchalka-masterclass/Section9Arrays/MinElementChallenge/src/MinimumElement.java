import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        return numElements;
    }

    private static int[] readElements(int len){
        int[] elements = new int[len];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < len; i++){
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
}
