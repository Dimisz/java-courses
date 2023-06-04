public class StringBuilderEquality {
    public static boolean isEqual(StringBuilder sb1, StringBuilder sb2){
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        return s1.equals(s2);
    }
}
