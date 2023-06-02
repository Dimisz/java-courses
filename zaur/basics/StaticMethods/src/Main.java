
public class Main {
    public static void main(String[] args) {
        System.out.println("Multiplying...");
        System.out.println(FirstClass.multiply(1, 2, 3));
        System.out.println(FirstClass.multiply(10, 20, 30));

        System.out.println("\nDividing....");
        FirstClass.printDivision(3.2, 2.1);
        FirstClass.printDivision(12.2, 12.1);

        System.out.println("\ngetCircumference method..");
        FirstClass.getCircumference(3);
        FirstClass.getCircumference(5);

        System.out.println("\ngetRadius");
        FirstClass fc = new FirstClass();
        fc.getCircleArea(3);
        fc.getCircleArea(5);

        System.out.println("\ngetInfo");
        fc.getCircleInfo(3);
        fc.getCircleInfo(5);

    }
}