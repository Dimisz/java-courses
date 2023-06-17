import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(3);
        int secondNum = GenericMethod.getSecondElement(al1);
        System.out.println(secondNum);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("First");
        al2.add("Second");
        al2.add("Third");
        String elt = GenericMethod.getSecondElement(al2);
        System.out.println(elt);

    }
}