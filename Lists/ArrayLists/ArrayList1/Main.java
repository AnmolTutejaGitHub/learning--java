package ArrayLists.ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
}

public class Main {

    public static void main(String[] args) {

        // array

        // object array means any object can be put in this array
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6); // default constructor
        groceryArray[2] = "Oranges";
        System.out.println(Arrays.toString(groceryArray)); // [GroceryItem[name=milk, type=DAIRY, count=1],
                                                           // GroceryItem[name=apples, type=PRODUCE, count=6], Oranges]

        GroceryItem[] groceryArray2 = new GroceryItem[3];
        groceryArray2[0] = new GroceryItem("milk");
        groceryArray2[1] = new GroceryItem("apples", "PRODUCE", 6);
        // groceryArray2[2] = "orange"; //error
        groceryArray2[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray2)); // [GroceryItem[name=milk, type=DAIRY, count=1],
                                                            // GroceryItem[name=apples, type=PRODUCE, count=6],
                                                            // GroceryItem[name=oranges, type=PRODUCE, count=5]]

        // ArrayList
        // ArrayList when declared without <> (means without specifying type )then it is
        // of type Object by default . It is called raw use of this type

        // we don't specify size of array list
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        // ArrayList of type GroceryItem (using class as datatype)
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
    }
}