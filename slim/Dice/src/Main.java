import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumOfUserNumbers = 0;

        int inputCount = 0;
        while(inputCount < 3){
            System.out.println("Guess a value: ");
            int userNum = sc.nextInt();
            if(userNum > 0 && userNum < 7){
                sumOfUserNumbers += userNum;
                inputCount++;
            }
            else {
                System.out.println("Please, enter a number greater than 0 and lower than 7.");
            }

        }

        Dice dice = new Dice();
        int diceSum = dice.getSum();
        System.out.println("Sum of your rolls: " + sumOfUserNumbers + ".");
        System.out.println("Sum of the dice rolls " + diceSum + ".");
        System.out.println(diceSum == sumOfUserNumbers ? "You won!" : "Sorry, you lost!");
    }
}