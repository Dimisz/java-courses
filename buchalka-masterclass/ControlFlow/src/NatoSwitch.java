public class NatoSwitch {
    public static void main(String[] args) {
        char letter = 'd';

        switch(letter){
            case 'A': case 'a':
                System.out.println("Able");
                break;
            case 'B': case 'b':
                System.out.println("Baker");
                break;
            case 'c': case 'C':
                System.out.println("Charlie");
                break;
            case 'D': case 'd':
                System.out.println("Dog");
                break;
            case 'E': case 'e':
                System.out.println("Easy");
                break;
            default:
                System.out.println("It was: " + letter + "!");
                break;
        }
//        switch(letter){
//            case 'A', 'a' -> System.out.println("Able");
//            case 'B', 'b' -> System.out.println("Baker");
//            case 'C', 'c' -> System.out.println("Charlie");
//            case 'D', 'd' -> System.out.println("Dog");
//            case 'E', 'e' -> System.out.println("Easy");
//        }
    }
}
