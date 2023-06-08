import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersInputChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while(count <= 4){
            System.out.println("Enter number #" + (count + 1) + ": ");
            String number = sc.nextLine();
            try {
                int num = Integer.parseInt(number.trim());
                sum += num;
                count++;
            }
            catch(NumberFormatException fme){
                System.out.println("Invalid input");
            }
        }

        System.out.println("The sum of the numbers you've entered is: " + sum);
    }

}
