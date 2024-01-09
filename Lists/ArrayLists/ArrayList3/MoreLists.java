package ArrayLists.ArrayList3;

// ArrayList methods 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = { "apples", "bananas", "milk", "eggs" };

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        ////////////////////////////////
        // ArrayList methods

        // get method
        System.out.println("Third item = " + groceries.get(2)); // Third item = milk

        // searching for element in ArrayList
        // contain method -> return boolean
        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        } // List contains mustard

        // indexOf and lastIndexOf methods
        // They return -1 if element is not found on the list
        // indexOf method founds the 1st occurence
        // while the lastIndexOf method returns the index of last occurence of the
        // element
        groceries.add("yogurt");
        System.out.println(groceries); // [apples, bananas, milk, eggs, yogurt, pickles, mustard, cheese, yogurt]
        System.out.println("first = " + groceries.indexOf("yogurt")); // first = 4
        System.out.println("last = " + groceries.lastIndexOf("yogurt")); // last = 8

        System.out.println(groceries); // [apples, bananas, milk, eggs, yogurt, pickles, mustard, cheese, yogurt]

        // remove method
        // removing elements from ArrayList
        // we can remove by index or we can remove by value too

        // removing by index
        groceries.remove(1);
        System.out.println(groceries);// apples, milk, eggs, yogurt, pickles, mustard, cheese, yogurt]

        // removing by value
        groceries.remove("yogurt");
        System.out.println(groceries); // [apples, milk, eggs, pickles, mustard, cheese, yogurt]
        // notice only one yogurt is removed
        // removes only single element (first occurence)

        // removeAll method
        // in addition to removing one element at a time ( by remove method) we can also
        // remove a set of elements
        groceries.removeAll(List.of("apples", "eggs"));
        // using List.of method to create a temporary List from a temporary list from a
        // variable arguments list of elements
        System.out.println(groceries); // [milk, pickles, mustard, cheese, yogurt]

        // retainAll method :
        groceries.retainAll(List.of("apples", "milk", "mustard",
                "cheese")); // elements I don't want deleted
        // methods with name All(addAll,removeAll,retainAll) takes List as
        // argument , use List.of

        // notice : apple is not in groceries but we passed it in retainAll method so it
        // just got ignored here

        System.out.println(groceries); // [milk, mustard, cheese]

        // clear method
        // removes all elements in the ArrayList
        groceries.clear(); // []

        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty()); // isEmpty = true
        // isEmpty method returns true if no element in the ArrayList

        // again adding elements in the ArrayList
        // addAll method (atatic method on List)
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));

        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries); // [apples, milk, mustard, cheese, eggs, pickles, mustard, ham]

        // sorting ArrayList
        groceries.sort(Comparator.naturalOrder());
        // sort method an ArrayList takes one argument called Comparator.
        // this special type allows instances to be compared to one another
        // About Comparators in detail in interfaces
        // naturalOrder() is static factory method

        System.out.println(groceries); // [apples, cheese, eggs, ham, milk, mustard, mustard, pickles]

        // sorting ArrayList in reverse order
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries); // [pickles, mustard, mustard, milk, ham, eggs, cheese, apples]

        // getting Array From ArrayList
        // toArray method --> it is overloaded method
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        // wtf ?? is this argument new String[groceries.size()]
        // By passing new String[groceries.size()] to
        // toArray, you are saying, "I want the resulting array to be of type String,
        // and I expect it to be big enough to hold all the elements in the groceries
        // list."

        // printing groceryArray we got using to String method
        System.out.println(Arrays.toString(groceryArray)); // [pickles, mustard, mustard, milk, ham, eggs, cheese,
                                                           // apples]

        // Here's a simplified explanation:

        // toArray Method: The toArray method is a way to convert the contents of an
        // ArrayList (like groceries) into a regular array.

        // new String[groceries.size()]: By passing new String[groceries.size()] to
        // toArray, you are saying, "I want the resulting array to be of type String,
        // and I expect it to be big enough to hold all the elements in the groceries
        // list."

        // groceryArray: The result of toArray is stored in the variable groceryArray.
        // Now, groceryArray is a regular array containing the same elements that were
        // in the groceries list.

        // Arrays.toString(groceryArray): This part simply converts the array
        // groceryArray into a readable string so you can print it to the console.

        // In simpler terms, the code takes the elements from the ArrayList and puts
        // them into a regular array, and then it prints that array. The provided
        // comments in the code indicate what you should see when printing the array.
    }
}

// note : methods with name All(addAll,removeAll,retainAll) takes List as
// argument , use List.of
