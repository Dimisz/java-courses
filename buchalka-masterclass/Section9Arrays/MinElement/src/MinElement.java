import java.util.Scanner;

public class MinElement {
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] userInputArray = userInput.split(",");
        int[] userNums = new int[userInputArray.length];
        for(int i = 0; i < userInputArray.length; i++){
            try{
                userNums[i] = Integer.parseInt(userInputArray[i].trim());
            }
            catch(NumberFormatException nfe){
                System.out.println("Could not convert the value (" + userInputArray[i].trim() +
                        "), replacing with (-1)");
                userNums[i] = -1;
            }
        }
        return userNums;
    }

    public static int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min) min = num;
        }
        return min;
    }
}
