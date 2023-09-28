import java.util.Scanner;

public class MinMaxInputNum {
    public static void getMinMaxNumbers(){
        int loopCount = 0;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number or type 'q' to quit: ");
            String userInput = scanner.nextLine();
            try {
                int enteredNumber = Integer.parseInt(userInput);
                if(enteredNumber < minNumber){
//                    System.out.println(enteredNumber + " is less than " + minNumber);
                    minNumber = enteredNumber;
                }
                if(enteredNumber > maxNumber){
//                    System.out.println(enteredNumber + " is greater than " + maxNumber);
                    maxNumber = enteredNumber;
                }
                loopCount++;
            }
            catch(NumberFormatException nfe){
                if(userInput.equals("q")) break;
            }
        }
        if(loopCount > 0){
            System.out.println("The min number is: " + minNumber);
            System.out.println("The max number is: " + maxNumber);
        }
        else {
            System.out.println("No valid data entered");
        }
    }
}
