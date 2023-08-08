public class Switch {
    public static void main(String[] args) {
        int switchValue = 10;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> System.out.println("It was 3 or 4 or 5.");
            default -> System.out.println("It was something else.");
        }
    }
}
