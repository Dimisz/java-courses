public class TraditionalSwitchChallenge {
    public static String getNatoLetter(char letter){
        switch(letter){
            case 'A': case 'a':
                return "Alpha";
            case 'B': case 'b':
                return "Bravo";
            case 'C': case 'c':
                return "Charlie";
            case 'D': case 'd':
                return "Delta";
            case 'E': case 'e':
                return "Echo";
            default:
                return "Unknown character";
        }
    }
}
