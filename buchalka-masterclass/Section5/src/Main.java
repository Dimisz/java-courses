public class Main {
    public static void main(String[] args) {
        System.out.print("true -> ");
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.print("false -> ");
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.print("false -> ");
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.print("false -> ");
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }
}