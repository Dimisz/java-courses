public class Sum3And5 {
    private static boolean isDivisibleBy3And5(int num){
        return num % 15 == 0;
    }

    public static void printNumbersDivisibleBy3And5(){
        int countOfMatches = 0;
        int sumOfMatches = 0;

        for(int i = 0; i <= 1000; i++){
            if(isDivisibleBy3And5(i)){
                countOfMatches++;
                sumOfMatches += i;
            }
        }
        System.out.println(countOfMatches + " numbers found that sum up to " +
                sumOfMatches);
    }
}
