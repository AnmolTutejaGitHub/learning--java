// two dimentional arrays
package TwoDimensionalArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2)); // [[I@7344699f, [I@6b95977, [I@7e9e5f8a, [I@8bcc55f]
        System.out.println("array2.length = " + array2.length); // array2.length = 4

        for (int[] outer : array2) { // int[] remember datatype
            System.out.println(Arrays.toString(outer));
        }
        // [0, 0, 0, 0]
        // [0, 0, 0, 0]
        // [0, 0, 0, 0]
        // [0, 0, 0, 0]

        // enhanced looping version of above code
        for (var outer : array2) { // var here is int[]
            for (var element : outer) { // var here is int
                System.out.print(element + " ");
            }
            System.out.println();
        }
        // output :
        // 0 0 0 0
        // 0 0 0 0
        // 0 0 0 0
        // 0 0 0 0

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i]; // here var is int[]
            for (int j = 0; j < innerArray.length; j++) {
                // System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
            // System.out.println();
        }

        // we need to use toString method 2 times to print a 2 D array
        // But Java provides us another method to print multi dimentional arrays ,
        // called deepToString

        System.out.println(Arrays.deepToString(array2)); // [[1, 2, 3, 4], [11, 12, 13, 14], [21, 22, 23, 24], [31, 32,
                                                         // 33, 34]]
    }
}
