public class TraditionalSwitchChallenge {
    public static void getNatoChar(char letter){
        switch(letter){
            case 'A':
            case 'a':
                System.out.println("Alpha");
                break;
            case 'B':
            case 'b':
                System.out.println("Bravo");
                break;
            case 'C':
            case 'c':
                System.out.println("Charlie");
                break;
            case 'D':
            case 'd':
                System.out.println("Dog");
                break;
            case 'E':
            case 'e':
                System.out.println("Echo");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
