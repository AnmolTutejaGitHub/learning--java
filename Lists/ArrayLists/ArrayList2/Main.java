package ArrayLists.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray)); // [1 MILK in DAIRY, 6 APPLES in PRODUCE, 5 ORANGES in
                                                           // PRODUCE]

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        System.out.print(groceryList); // [1 MILK in DAIRY, 6 APPLES in PRODUCE, 5 ORANGES in PRODUCE]

        // another version of add method
        // here add at index 0 , moving all other elements down
        groceryList.add(0, new GroceryItem("oranges", "PRODUCE", 5));

        System.out.println(groceryList); // [5 ORANGES in PRODUCE, 1 BUTTER in DAIRY, 1 MILK in DAIRY]
        // set method
        groceryList.set(0, new GroceryItem("apples", "PRODUCE", 6));

        // remove method
        groceryList.remove(1);
        System.out.println(groceryList); // [6 APPLES in PRODUCE, 1 MILK in DAIRY]
    }
}
