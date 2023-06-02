public class FirstClass {
    static final double PI = 3.14;
    public static double multiply(double num1, double num2, double num3){
        return (num1 * num2 * num3);
    }

    public static void printDivision(double num1, double num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static double getCircumference(double radius){
        double circumference = 2 * PI * radius;
        System.out.println("getCircumference: circumference = " + circumference);
        return circumference;
    }

    public double getCircleArea(double radius){
        double area = radius * PI * radius;
        System.out.println("getCircleArea: area = " + area);
        return area;
    }

    public void getCircleInfo(double radius){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getCircleArea(radius));
        System.out.println("Circumference: " + getCircumference(radius));
    }
}
