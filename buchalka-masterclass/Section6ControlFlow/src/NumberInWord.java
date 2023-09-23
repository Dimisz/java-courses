public class NumberInWord {
    public static void printNumberInWord(int number){
        String numberAsWord = switch(number){
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "other";
        };
        numberAsWord = numberAsWord.toUpperCase();
        System.out.println(numberAsWord);
    }
}
