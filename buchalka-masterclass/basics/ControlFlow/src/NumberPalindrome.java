public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        int absNum = Math.abs(num);

        int i = absNum;
        int reversed = 0;
        while(i > 0){
            reversed *= 10;
            reversed += i % 10;
//            System.out.println("reversed: " + reversed);
            i /= 10;
        }
//        reversed += i;

        boolean result = (reversed == absNum);
//        System.out.println("num: " + num + " absNum: " + absNum + " reversed: " + reversed + " returns: " + result);
        return result;
    }
}
