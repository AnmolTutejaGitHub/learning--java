// array to ArrayList 

package ArrayLists.ArrayList2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MoreList {

    public static void main(String[] args) {
        // converting array to ArraayList
        // Easy method to create ArrayList otherwise keep using add method on Arraylist

        // array
        String[] items = { "apple", "bananas", "milk", "eggs" };
        System.out.println(Arrays.toString(items)); // [apple, bananas, milk, eggs]

        // List
        List<String> list = List.of(items);
        System.out.println(list); // [apple, bananas, milk, eggs]

        // List.of() method here transformed the array of string to List of string
        // List.of() -> static method on List , also a factory method

        System.out.println(list.getClass().getName()); // getName method gives more info than getSimpleName() method
        // java.util.ImmutableCollections$ListN
        // The List we are getting is of type N and it is nested class within the
        // Immutable Collections class. But most importantly it is immutable

        // list.add("yogurt"); // gives runtime error

        ArrayList<String> groceries = new ArrayList<>(list); // now converted to ArrayList which is mutable
        groceries.add("yogurt");
        System.out.println(groceries); // [apple, bananas, milk, eggs, yogurt]

        // why this code ?
        // The aboe codes can be used for easier creating of ArrayList otherwise keep
        // using add method on ArrayList

        // create array
        // convert to List
        // convert to ArrayList

        // can do all this in one statement
        ArrayList<String> nextList = new ArrayList(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList); // [pickles, mustard, cheese]

        // There is another method addAll method on Arraylist which takes any List as
        // argument
        groceries.addAll(nextList);
        System.out.println(groceries); // [apple, bananas, milk, eggs, yogurt, pickles, mustard, cheese]
        // all elements of nextList added to groceries

    }
}
