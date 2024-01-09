package ArrayArrayListConversion;

import java.util.*;

//  array to ArrayList in java 
public class ArrayToArrayList {

    public static void main(String[] args) {

        ////////////
        String[] array = { "first", "second", "third" };

        // convert Array to List
        List<String> list = List.of(array);

        // convert list to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(list);
        System.out.println(Arrays.toString(array)); // [first, second, third]
        System.out.println(list); // [first, second, third]
        System.out.println(arrayList); // [first, second, third]

        ////// can do all of it in one statement
        ArrayList<String> arraylist2 = new ArrayList<>(List.of("first", "second", "third"));
        System.out.println(arraylist2); // [first, second, third]

        ////////////////////////////////
        // Arrays.asList method returns ArrayList backed by an arrays
        String[] originalArray = new String[] { "first", "second", "third" };
        var originallist = Arrays.asList(originalArray);
        System.out.println(originallist.getClass().getSimpleName()); // ArrayList

        // Arrays.asList() method :
        // Any change to the list is the change to the array that backs it
        // This also means that ArrayList created with this method is not resizable

        originallist.set(0, "1");
        System.out.println(originallist); // [1, second, third]
        System.out.println(Arrays.toString(originalArray)); // [1, second, third]

        // sorting not working how ???
        originallist.sort(Comparator.naturalOrder());
        System.out.println(originallist);
        System.out.println(Arrays.toString(originalArray));

        // originallist.remove(0); // run time error
        // originallist.add("third"); // error

        // we can create a fixed sized list using Arrays.aslist method

        List<String> newList = Arrays.asList("sunday", "monday", "tuesday");
        System.out.println(newList); // [sunday, monday, tuesday]
        System.out.println(newList.getClass().getSimpleName()); // ArrayList
        // ArrayList backed by array
    }

}
