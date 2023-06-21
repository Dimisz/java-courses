public class NatoAlphabet {
    public static String getNatoSpelling(char letter){
        switch(letter){
            case 'A': case 'a':
                return "Alpha";
//                break;
            case 'B': case 'b':
                return "Bravo";
//                break;
            case 'C': case 'c':
                return "Charlie";
//                break;
            default:
                return "Letter not found";
        }
    }


    public static String printDayOfWeek(int dayNumber){
        return switch (dayNumber){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> {
                System.out.println("Hey hey it's Friday!!!");
                yield "Friday";
            }
            case 6, 7 -> "Day off";
            default -> "Some day";
        };
    }
}
