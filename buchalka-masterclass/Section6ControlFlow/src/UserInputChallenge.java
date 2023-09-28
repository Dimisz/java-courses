import java.util.Scanner;

public class UserInputChallenge {
    public static void getUserNumbers(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(count < 5){
            System.out.println("Enter number #" + (count + 1) + ": ");
            String userInput = scanner.nextLine();
            try {
                int userNumber = Integer.parseInt(userInput);
                System.out.println("You've entered " + userNumber);
                count++;
                sum += userNumber;
            }
            catch(Exception ex){
                System.out.println(userInput + " is not a valid number");
            }
            finally {
                System.out.println("The sum of integers you've entered is " + sum);
            }
        }
    }
}
