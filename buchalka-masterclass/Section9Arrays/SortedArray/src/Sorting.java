import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static int[] getIntegers(int len){
        int[] enteredNumbers = new int[len];
        Scanner scanner = new Scanner(System.in);
        int numbersEntered = 0;
        while(numbersEntered <= len - 1){
            try{
                enteredNumbers[numbersEntered] = Integer.parseInt(scanner.nextLine());
                numbersEntered++;
            }
            catch(Exception ex){
                System.out.println("Enter an integer");
            }

        }
        return enteredNumbers;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        while(flag){
            int swapsCount = 0;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    swapsCount++;
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                }
            }
            if(swapsCount == 0){
                flag = false;
            }
        }
        return sortedArray;
    }
}
