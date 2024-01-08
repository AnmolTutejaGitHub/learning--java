package ArrayLists;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        // 2 D ArrayList = dynamic list of lists . you can change the size of hese lists
        // during runtime
        ArrayList<String> bakerList = new ArrayList();
        bakerList.add("pasta");
        bakerList.add("garlic bread");
        bakerList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("coffee");
        drinkList.add("Whisky");

        // creating 2D ArrayList
        ArrayList<ArrayList<String>> groceryList = new ArrayList(); // inside <> write what we want to store . here we
                                                                    // want to store ArrayList of String

        groceryList.add(bakerList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList); // [[pasta, garlic bread, donuts], [tomatoes, zucchini, peppers], [soda,
                                         // coffee, Whisky]]
        System.out.println(groceryList.get(0).get(0)); // pasta

    }
}
