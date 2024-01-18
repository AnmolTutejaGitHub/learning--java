package Generics.Basics;

import java.util.ArrayList;
import java.util.List;

// wild card in java 
// example a list that can take any type of things

public class wild_card {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        // printList1(intList); //error
        // even though an integer is subclass of object , a list isn't subclass of list
        // of object . This is why wildcard in needed

        printList2(intList);
    }

    public static void printList1(List<Object> mylist) {
        System.out.println(mylist);
    }

    public static void printList2(List<?> mylist) {
        System.out.println(mylist);
    }

    // can also have bounded wild card
    // can have public static void printList1(List<? extends Animal> mylist) {} //
    // now method only takes list of animal or its subclass
}
