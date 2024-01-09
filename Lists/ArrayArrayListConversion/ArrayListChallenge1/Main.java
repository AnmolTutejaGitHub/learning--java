package ArrayArrayListConversion.ArrayListChallenge1;
// The challenge is to create an interactive console program.

// And give the user a menu of options as shown here:

// Available actions:

// 0 - to shutdown

// 1 - to add item(s) to list (comma delimited list)

// 2 - to remove any items (comma delimited list)

// Enter a number for which action you want to do:

// Using the Scanner class, solicit a menu item, 0, 1 or 2,  and process the item accordingly.

// Your grocery list should be an ArrayList.
// You should use methods on the ArrayList, to add items, remove items, check if an item is already in the list, and print a sorted list.
// You should print the list, sorted alphabetically, after each operation.
// You shouldn't allow duplicate items in the list.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {

        System.out.println("Add item(s) [separate items by comma]:");
        // otherwise i would be creating a String then spliting than on comma then in
        // String Array
        String[] items = scanner.nextLine().split(",");
        // groceries.addAll(List.of(items)); // has duplicates and has white spaces

        for (String i : items) {

            // trimming white space
            String trimmed = i.trim();

            // checking if element is present in the ArrayList or not
            if (groceries.indexOf(trimmed) < 0) { // checks if present in ArrayList or not
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {

        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printActions() {

        String textBlock = """
                Available actions:

                0 - to shutdown

                1 - to add item(s) to list (comma delimited list)

                2 - to remove any items (comma delimited list)

                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }
}
