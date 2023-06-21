public class InchesToCentimeters {
    public static double convertToCentimeters(int inches){
        return (inches * 2.54);
    }

    public static double convertToCentimeters(int feet, int inches){
        int totalInches = (feet * 12) + inches;
        return (convertToCentimeters(totalInches));
    }
}
