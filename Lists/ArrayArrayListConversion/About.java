package ArrayArrayListConversion;

import java.util.*;

// crearting special kind of List
// Arrays.asList vs List.of method
public class About {
    // below are two ways to create a list from elements, or from an
    // array of elements.
    // Both are static factory methods on types.
    // The first is the asList method on the Arrays class, and it returns a special
    // instance of a List, that is not resizable, but is mutable.
    // The second is the of method on the List interface, and it returns a special
    // instance of a List, that is immutable.
    // Both support variable arguments, so you can pass a set of arguments of one
    // type, or you can pass an array.

    public static void main(String[] args) {

        // using Arrays.asList
        // returned list is not resizable but mutable
        var newList = Arrays.asList("Sunday", "Monday", "Tuesday"); // passing multiple arguments

        String[] days = new String[] { "Sunday", "Monday", "tuesday" };
        List<String> newList2 = Arrays.asList(days); // passing array
        System.out.println(newList2.getClass().getName());

        // using List.of method
        // returned list is immutable
        var listone = List.of("sunday", "monday", "tuesday");

        String[] day = new String[] { "sunday", "monday", "tuesday" };
        List<String> listone2 = Arrays.asList(day);
        System.out.println(listone2.getClass().getName());

        ////////////////////////
        // Creating Array from ArrayList
        ArrayList<String> stringLists = new ArrayList<>(List.of("jan", "feb", "mar"));
        String[] stringArray = stringLists.toArray(new String[0]);

        // Above is the most common method to create an array, from an ArrayList, using
        // the method toArray().
        // This method takes one argument, which should be an instance of a typed array.
        // This method returns an array of that same type.
        // If the length of the array you pass, has more elements than the list, extra
        // elements will be filled with the default values for that type.
        // If the length of the array you pass, has less elements than the list, the
        // method will still return an array, with the same number of elements in it, as
        // the list.
        // In the example shown here, we pass a String array with zero as the size, but
        // the array returned has three elements, which is the number of elements in the
        // list.

    }

}
