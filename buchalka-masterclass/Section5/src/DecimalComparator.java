public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        String num1String;
        String num2String;
        if(num1 < 0 && num2 < 0) {
            num1String = String.valueOf(num1 * 100).substring(0, 6);
            num2String = String.valueOf(num2 * 100).substring(0, 6);
        }
        else{
            num1String = String.valueOf(num1 * 100).substring(0, 5);
            num2String = String.valueOf(num2 * 100).substring(0, 5);
        }
        return num1String.equals(num2String);
    }
}
