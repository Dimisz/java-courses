import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){
            String userInput = sc.nextLine();
            try {
                int userNumber = Integer.parseInt(userInput);
                sum += userNumber;
                count++;
            }
            catch(NumberFormatException nfe){
                int avg = (int)Math.round((double)sum / (double)count);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
