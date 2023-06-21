import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add(0, "Three");
//        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>(list1);
//        System.out.println(list2);

//        System.out.println(list1 == list2);

        for(String s: list1){
            System.out.print(s + " ");
        }
        System.out.println();
        // .get(index) method
        for(int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
// .SET(INDEX, ELT) -> REPLACES ELT AT INDEX
        list1.set(0, "Zero");
        for(String s: list1){
            System.out.println(s);
        }
        //.addAll(elts) or .addAll(ind, elts)
        ArrayList<String> negatives = new ArrayList<>(3);
        negatives.add("Negative Three");
        negatives.add("Negative Two");
        negatives.add("Negative One");

        list1.addAll(0, negatives);
        System.out.println(list1);

        ArrayList<String> positives = new ArrayList<>(3);
        positives.add("Four");
        positives.add("Five");
        positives.add("Six");
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
        System.out.println(list1.isEmpty());
    }
}
