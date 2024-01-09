package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(0); // 0 --> element
        list.add(2);
        list.add(3);

        System.out.println(list); // [0, 2, 3]

        // get elements
        int element = list.get(1); // 1 --> index
        System.out.println(element); // 2

        // add element in between
        list.add(1, 1); // (index,element)
        System.out.println(list); // [0, 1, 2, 3]

        // set element
        list.set(0, 5); // (index,element)
        System.out.println(list); // [5, 1, 2, 3]

        // delete element
        list.remove(2); // (index)
        System.out.println(list); // [5, 1, 3]

        // length / size of arraylist
        int size = list.size();
        System.out.println(list); // [5, 1, 3]
        System.out.println(size); // 3
        System.out.println();

        // loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // 5 1 3
        }

        // sorting
        Collections.sort(list);
        System.out.println(list); // [1, 3, 5]
    }
}
