public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();
        int diceSum = dice.getSum();
        User user = new User();
        int sumOfUserNumbers = user.getUserNums();

        System.out.println("Sum of your rolls: " + sumOfUserNumbers + ".");
        System.out.println("Sum of the dice rolls " + diceSum + ".");
        System.out.println(diceSum < sumOfUserNumbers && diceSum >= sumOfUserNumbers - 2 ? "You won!" : "Sorry, you lost!");
    }
}