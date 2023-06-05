import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> mySet = new ArrayList<>();
        mySet = SortedSet.getSortedSet("First", "Second", "First", "First", "Apple", "Dimi", "Apple");
        System.out.println(mySet.toString());
    }
}