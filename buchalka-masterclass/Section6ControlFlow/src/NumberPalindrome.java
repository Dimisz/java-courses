public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        int absNum = Math.abs(num);
        int reversedNum = 0;
        while(absNum > 0){
            reversedNum *= 10;
            reversedNum += absNum % 10;
            absNum /= 10;
        }
        return Math.abs(num) == reversedNum;
    }
}
