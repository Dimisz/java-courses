public class Switch {
    public static void main(String[] args) {
        int switchValue = 10;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("It was 3 or 4 or 5.");
                break;
            default:
                System.out.println("It was something else.");
                break;
        }
    }
}
