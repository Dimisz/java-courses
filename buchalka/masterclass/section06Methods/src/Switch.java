public class Switch {
    public static void printNumberInWord(int number){
        String numberAsString = switch(number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(numberAsString);
    }
    public static void printDayOfWeek(int dayNum){
        String dayOfWeek = switch(dayNum){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Wrong input";
        };
        System.out.println(dayNum + ": " + dayOfWeek);
    }
    public static String mapToNatoAlphabet(char letter){
        switch(letter){
            case 'A': case 'a':
                return "Alpha";
            case 'B': case 'b':
                return "Bravo";
            case 'C': case 'c':
                return "Charlie";
            case 'D': case 'd':
                return "Delta";
            default:
                return "Something else";
        }
    }
}
