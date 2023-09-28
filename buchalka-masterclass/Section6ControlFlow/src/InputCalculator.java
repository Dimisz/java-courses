import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            String userInput = scanner.nextLine();
            try {
                int userNum = Integer.parseInt(userInput);
                count++;
                sum += userNum;
                avg = Math.round((double)sum / count);
            }
            catch(NumberFormatException nfe){
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
