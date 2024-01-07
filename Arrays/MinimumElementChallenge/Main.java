// Write a method called readIntegers, that reads a comma delimited list of numbers, entered by the user from the console, and then returns an array, containing those numbers that were entered.
// Next, write a method called findMin, that takes the array as an argument, and returns the minimum value found in that array.

//In the main method
// Call the method readIntegers, to get the array of integers from the user, and print these out, using a method found in java.util.Arrays.  
// Next, call the findMin method, passing the array, returned from the call to the readIntegers method.
// Print the minimum element in the array, which should be returned from the findMin method.
// A tip here. Assume that the user will only enter numbers - so you don't need to do any validation for the console input.

package MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim()); // trim() method removes white spaces
        }

        return values;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }
}
