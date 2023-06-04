public class Main {
    public static void main(String[] args) {
       StringBuilder sb1 = new StringBuilder("first string builder");
        StringBuilder sb2 = new StringBuilder("first string builder");
        StringBuilder sb3 = new StringBuilder("second string builder");

        System.out.println(StringBuilderEquality.isEqual(sb1, sb2));
        System.out.println(StringBuilderEquality.isEqual(sb2, sb2));
        System.out.println(StringBuilderEquality.isEqual(sb1, sb3));
    }
}