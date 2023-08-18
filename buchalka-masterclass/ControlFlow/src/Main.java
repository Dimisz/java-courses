public class Main {
    public static void main(String[] args) {
        String day = SwitchExpressionChallenge.getDayOfWeek(0);
        System.out.println(day);
        day = SwitchExpressionChallenge.getDayOfWeek(1);
        System.out.println(day);
        day = SwitchExpressionChallenge.getDayOfWeek(2);
        System.out.println(day);
        day = SwitchExpressionChallenge.getDayOfWeek(3);
        System.out.println(day);
        day = SwitchExpressionChallenge.getDayOfWeek(4);
        System.out.println(day);
        day = SwitchExpressionChallenge.getDayOfWeek(5);
        System.out.println(day);
        day = SwitchExpressionChallenge.getDayOfWeek(6);
        System.out.println(day);

        System.out.println("Checking with invalid args");
        day = SwitchExpressionChallenge.getDayOfWeek(-1);
        System.out.println(day);
        day = SwitchExpressionChallenge.getDayOfWeek(10);
        System.out.println(day);
    }
}