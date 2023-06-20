import java.util.Scanner;

public class User {
    private int sumNums;

    public User(){
        this.sumNums = getUserGuess();
    }

    public int getUserNums(){
        return this.sumNums;
    }

    private int getUserGuess(){
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
        return sumOfUserNumbers;
    }
}
