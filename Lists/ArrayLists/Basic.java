package ArrayLists;

import java.util.ArrayList;

public class Basic {
    // ArrayList is a resizable array . Elements can be added and removed after
    // compilation phase store reference data types

    public static void main(String[] args) {

        // creating an array list (no need to specify size here like we do in array
        // list)
        ArrayList<String> food = new ArrayList<String>(); // into <> specify data type u want ur ArrayList to store
        // ArrayList<String> food = new ArrayList<>(); //new java syntax specify only
        // one time
        // since in ArrayList u can store reference data types , use wrapper class for
        // primitives. // ArrayList<Integer>

        // add method on ArrayList
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        System.out.println(food);// no need to use toString method to print arrayList
        // [pizza, hamburger,hotdog]

        for (int i = 0; i < food.size(); i++) { // for array list we have size method instead of length
            System.out.println(food.get(i)); // syntax instead od food[i] we do in array
        }
        // pizza
        // hamburger
        // hotdog

        ///////////////////////////////
        // method on ArrayList
        // set method : we can set a value at a certain index
        food.set(0, "sushi"); // setting value at 0 index

        // remove method : can remove a value at certain index
        food.remove(0); // removes a value at certain index

        System.out.println(food); // [hamburger, hotdog]
        // notice the output above

        // clear method : to clear an arraylist
        food.clear();
        System.out.println(food); // []

    }
}
