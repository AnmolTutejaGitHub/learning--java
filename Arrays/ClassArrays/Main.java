package ClassArrays;

// import java.util.Arrays;
// import java.util.Random;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray)); // [64, 41, 78, 28, 10, 69, 18, 48, 42, 5]

        // sorting an array
        Arrays.sort(firstArray); // This method does not return anything it's return type is void.
        // The actual array we passed to it gets sorted
        System.out.println(Arrays.toString(firstArray)); // 5, 10, 18, 28, 41, 42, 48, 64, 69, 78]

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // fill method
        Arrays.fill(secondArray, 5); // sets every element of the array to 5
        // [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
        System.out.println(Arrays.toString(secondArray));

        // copyOf method
        // For primitives , values get copied
        // for objects, object reference gets copied
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray)); // [67, 85, 4, 64, 51, 15, 1, 63, 65, 16]

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray)); // [67, 85, 4, 64, 51, 15, 1, 63, 65, 16]

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray)); // [67, 85, 4, 64, 51, 15, 1, 63, 65, 16]
        System.out.println(Arrays.toString(fourthArray)); // [1, 4, 15, 16, 51, 63, 64, 65, 67, 85]

        // if no. (newLength) we passed in Arrays.copyOf is less than original array
        // length
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray)); // [67, 85, 4, 64, 51]

        // if no.(newLength) we passed in Arrays.copyOf is greater than original array
        // length
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray)); // [67, 85, 4, 64, 51, 15, 1, 63, 65, 16, 0, 0, 0, 0, 0]
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}