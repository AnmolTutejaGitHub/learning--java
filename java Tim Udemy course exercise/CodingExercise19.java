// Shared Digit
// Write a method named hasSharedDigit with two parameters of type int. 

// Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

// The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

// EXAMPLE INPUT/OUTPUT:

// hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

// hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

// hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

// NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.

// NOTE: Do not add a main method to the solution code.

public class CodingExercise19 {
    // my logic
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99)
            return false;
        String as = "" + a;
        String bs = "" + b;

        for (int i = 0; i < (("" + (Math.max(a, b))).length()); i++) {
            for (int j = 0; j < (("" + (Math.min(a, b))).length()); j++) {
                if (as.charAt(i) == bs.charAt(j))
                    return true;
            }
        }
        return false;
    }

}
// my logic passed all test cases

// // given logic (mathematical)
// public class SharedDigit {

// public static boolean hasSharedDigit(int first, int second) {

// boolean firstValid = first > 9 && first < 100;
// boolean secondValid = second > 9 && second < 100;

// if (!firstValid || !secondValid) {
// return false;
// }

// int firstLeftDigit = first / 10;
// int firstRightDigit = first % 10;
// int secondLeftDigit = second / 10;
// int secondRightDigit = second % 10;

// boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit ==
// secondRightDigit;
// boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit
// == secondRightDigit;

// return firstShared || secondShared;
// }
// }
