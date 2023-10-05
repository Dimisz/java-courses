public class Main {
    public static void main(String[] args) {
        SmartKitchen sk = new SmartKitchen();
        sk.doKitchenWork();
        sk.setKitchenState(true, false, false);
        sk.doKitchenWork();
        sk.setKitchenState(true, true, true);
        sk.doKitchenWork();
        sk.doKitchenWork();
    }
}