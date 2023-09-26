public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99) return false;
        if(num2 < 10 || num2 > 99) return false;
        while(num1 > 0){
            int currentNumA = num1 % 10;
            int tempNum2 = num2;
            while(tempNum2 > 0){
                int currentNumB = tempNum2 % 10;
                if(currentNumA == currentNumB) return true;
                tempNum2 /= 10;
            }
            num1 /= 10;
        }
        return false;
    }
}
