package collections_framework.CollectionPart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        String[] names1 = { "Anna", "Bob", "Carol", "David", "Edna" };
        list1.addAll(Arrays.asList(names1));
        System.out.println(list1); // [Anna, Bob, Carol, David, Edna]
        list1.add("Fred");
        list1.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list1); // [Anna, Bob, Carol, David, Edna, Fred, George, Gary, Grace]
        System.out.println("Gary is in the list? " + list1.contains("Gary")); // Gary is in the list? true

        list1.removeIf(s -> s.charAt(0) == 'G'); // lamda expression
        System.out.println(list1); // [Anna, Bob, Carol, David, Edna, Fred]
        System.out.println("Gary is in the list? " + list1.contains("Gary")); // Gary is in the list? false

        //////////////////////////////////////////////////////////////

        // If I do Collection<String> list2 = new ArrayList<>();
        // all of my previous code compiles and run
        // this is how interfaces works
        Collection<String> list2 = new ArrayList<>();
        String[] names2 = { "Anna", "Bob", "Carol", "David", "Edna" };
        list2.addAll(Arrays.asList(names2));
        System.out.println(list2); // [Anna, Bob, Carol, David, Edna]
        list2.add("Fred");
        list2.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list2); // [Anna, Bob, Carol, David, Edna, Fred, George, Gary, Grace]
        System.out.println("Gary is in the list? " + list2.contains("Gary")); // Gary is in the list? true
        list2.removeIf(s -> s.charAt(0) == 'G'); // lamda expression
        System.out.println(list2); // [Anna, Bob, Carol, David, Edna, Fred]
        System.out.println("Gary is in the list? " + list2.contains("Gary")); // Gary is in the list? false

        //////////////////////////////////////////////////////////////

        // If I change ArrayList to TreeSet implementation is still the same // same
        // output as previous
        Collection<String> list3 = new TreeSet<>();
        String[] names3 = { "Anna", "Bob", "Carol", "David", "Edna" };
        list3.addAll(Arrays.asList(names3));
        System.out.println(list3); // [Anna, Bob, Carol, David, Edna]
        list3.add("Fred");
        list3.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list3); // [Anna, Bob, Carol, David, Edna, Fred, George, Gary, Grace]
        System.out.println("Gary is in the list? " + list3.contains("Gary")); // Gary is in the list? true
        list3.removeIf(s -> s.charAt(0) == 'G'); // lamda expression
        System.out.println(list3); // [Anna, Bob, Carol, David, Edna, Fred]
        System.out.println("Gary is in the list? " + list3.contains("Gary")); // Gary is in the list? false

        ////////////////////////////////////////////////////////////////
        // if I changes to HashSet()
        // The code still compiles and run but this time output is different
        // The elements in HashSet aren't ordered

        Collection<String> list = new HashSet<>();

        String[] names = { "Anna", "Bob", "Carol", "David", "Edna" };
        list.addAll(Arrays.asList(names));
        System.out.println(list); // [Edna, Bob, David, Carol, Anna]

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list); // [Gary, Edna, Bob, George, Grace, David, Fred, Carol, Anna]
        System.out.println("Gary is in the list? " + list.contains("Gary")); // Gary is in the list? true

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list); // [Edna, Bob, David, Fred, Carol, Anna]
        System.out.println("Gary is in the list? " + list.contains("Gary")); // Gary is in the list? false
        // list.sort(); //error

        // The Collection interface does not have sort method
        // The List interface does (remember interface can be extended to another
        // interface) , but the Collection interface is more abstract than a List
        // meaning ArrayList extends(or implements) Collection , List

        // There isn't any direct implementation of Collection interface
        // Collection is top level interface and other interfaces are derived from it .
        // And implementation (or concrete classes) implements the derived interface
        // like List and Set

        // Collection <String> list5 = new ArrayList<>();
        // polymorphism
        // list5.add("Abc"); // overridden method on ArrayList class gets implemented
        // (ArrayList class implements List interface , List extends Collection
        // interface )

        // list5.add("abc") method on ArrayList class gets executed(remeber
        // List,Collections are abstract)

        // Here Collection <String> list5 = new ArrayList<>(); --> polymorphism -- > if
        // I do list5.add("abc") and list5 is declared with Collection // acc to
        // polymorphism I can implement overrriden methods on ArrayList class but I
        // can't implement methods specific to List or ArrayList

        // in general , ArrayList class implements List interface , List interface
        // extends Collection interface
        // Collection --> has abstract methods
        // List --> extends Collection , has new abstract methods specific to List
        // ArrayList implements Collection interface , has overridden methods for both
        // List and Collection interface

    }
}
