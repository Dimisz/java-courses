public class ForLoop {
    public static double calculateInterest(double rate, double amount){
        return amount + (amount * (rate / 100));
    }

    public static void printRates(double amount){
        for(double i = 7.5; i <= 10.0; i += 0.25){
            System.out.println(amount + " at " + i + "% interrest rate will make " + calculateInterest(i, amount));
        }
    }
}
