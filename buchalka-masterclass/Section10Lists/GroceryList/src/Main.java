import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "Produce", 6);
        groceryArray[2] = new GroceryItem("Oranges", "Produce", 5);
//        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Apples", "Produce", 2));
        groceryList.add(new GroceryItem("Watermelon", "Produce", 1));
        groceryList.add(new GroceryItem("Cake", "Bakery", 4));
        groceryList.set(0, new GroceryItem("Milk"));
        groceryList.remove(1);
        System.out.println(groceryList);

        String[] items = { "apples", "oranges", "lemons" };
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

    }
}