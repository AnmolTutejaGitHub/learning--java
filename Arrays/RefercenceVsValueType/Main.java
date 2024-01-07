package RefercenceVsValueType;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // myIntArray = [0, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // anotherArray = [0, 0, 0, 0, 0]

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray = "
                + Arrays.toString(myIntArray)); // after change myIntArray = [1, 2, 0, 0, 0]
        System.out.println("after change anotherArray = " +
                Arrays.toString(anotherArray)); // after change anotherArray = [1, 2, 0, 0, 0]
    }

    private static void modifyArray(int[] array) {

        // in functions , for objects (array is also an onject in java) copy of
        // reference is passed

        // for primities copy of value is passed in function ,,,, swap nahi hoga

        array[1] = 2;
    }
}
