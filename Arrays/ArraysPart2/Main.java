// When you don't use an array initializer statement, all array elements get initialized to the default value for that type.
// For primitive types, this is zero for any kind of numeric primitive, like int, double or short.
// For booleans, the default value will be false.
// And for any class type, the elements will be initialized to null.
package ArraysPart2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        // newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            // System.out.print(newArray[i] + " "); // 0 0 0 0 0
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        } // 5 4 3 2 1
        System.out.println();

        // the enchanced for loop / for each loop in java
        for (int element : newArray) {
            System.out.print(element + " "); // 5 4 3 2 1
        }
        System.out.println();
        System.out.println(newArray); // [I@764c12b6 //I --> integer , @764c12b6 -> hashcode
        System.out.println(Arrays.toString(newArray)); // [5, 4, 3, 2, 1]

        // Can asssign any array to Object variable
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array"); // objectVariable is really an int array
        }

        // object array
        // can have any type of array
        Object[] objectArray = new Object[5];

        // can have different types of element in array
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
        objectArray[3] = Arrays.toString(newArray);
        objectArray[4] = 45;

        System.out.println(Arrays.toString(objectArray)); // Hello, World, [I@764c12b6, [5, 4, 3, 2, 1], 45]
    }
}
