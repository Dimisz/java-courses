public class WhileLoopChallenge {
    private static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }

    public static void printEvenNumbers(int start, int end){
        if(start > end){
            System.out.println("Start value (" + start + ") should be less than the end value (" +
                    end + ").");
        }
        else{
            int count = start;
            while(count <= end){
                if(isEvenNumber(count)){
                    System.out.println(count);
                }
                count++;
            }
        }
    }
}
