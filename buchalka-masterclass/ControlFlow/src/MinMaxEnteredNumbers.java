import java.util.Scanner;

public class MinMaxEnteredNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minNumber = 0.0;
        double maxNumber = 0.0;
        boolean running = true;

        while (running) {
            System.out.println("Enter a number or 'q'/'Q' to quit: ");
            String userInput = sc.nextLine();
            try {
                double num = Double.parseDouble(userInput);
                if (num < minNumber) {
                    minNumber = num;
                }
                if (num > maxNumber) {
                    maxNumber = num;
                }
            } catch (NumberFormatException nfe) {

                if (userInput.equals("Q") || userInput.equals("q")) {
                    System.out.println("Quitting...");
                    running = false;
//                    break;
                }
                else{
                    System.out.println("Numbers only");
                }
            }
        }
        System.out.println("Minimum number is: " + minNumber);
        System.out.println("Maximum number is: " + maxNumber);
    }
}
