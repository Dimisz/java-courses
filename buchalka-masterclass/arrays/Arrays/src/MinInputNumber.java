import java.util.Arrays;
import java.util.Scanner;

public class MinInputNumber {
    public static void main(String[] args) {
        int len = readInteger();
        int[] nums = readElements(len);
        System.out.println(Arrays.toString(nums));
        int min = findMin(nums);
        System.out.println(min);
    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        return len;
    }

    private static int[] readElements(int len){
        Scanner scanner = new Scanner(System.in);
        String[] elts = scanner.nextLine().split(",");
//        System.out.println(Arrays.toString(elts));

        int[] nums = new int[len];
        for(int i = 0; i < len; i++){
            nums[i] = Integer.parseInt(elts[i].trim());
        }
        return nums;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
