package ClassArrays;

// sotring array in decreasing order 
// Create a program using arrays, that sorts a list of integers, in descending order. 
// You can choose to create a new sorted array, or just sort the current array.
import java.util.Arrays;
import java.util.Random;

public class SortingInReverse {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[] { 7, 30, 35 });
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(1000);
        }

        return randomArray;
    }

    // sorting in decreasing order
    private static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {

                    // swapping
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    // System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            // System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}
