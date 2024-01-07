package BinarySearch;

import java.util.Arrays;

public class OnArraysClass {
    public static void main(String[] args) {
        String[] Epstein = { "Ghislaine Maxwell", "Prince Andrew", "David Copperfield", "Leonardo DiCaprio",
                "Stephen Hawking" };
        Arrays.sort(Epstein); // [David Copperfield, Ghislaine Maxwell, Leonardo DiCaprio, Prince Andrew,
                              // Stephen Hawking]
        System.out.println(Arrays.toString(Epstein));

        if (Arrays.binarySearch(Epstein, "Stephen Hawking") >= 0) {
            System.out.println("Found Stephen Hawking in the list");
        } // Found Stephen Hawking in the list

        // comparing two strings :
        // Two strings are considered equal , if both arrays , contain the same number
        // of elements , and all elements in the same position in both arrays , are
        // equal

        int[] s1 = { 1, 2, 3, 4, 5 };
        int[] s2 = { 1, 2, 3, 4, 5 };

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        } // Arrays are equal

        int[] s3 = { 1, 2, 3, 4, 5, 0 };

        if (Arrays.equals(s1, s3)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        } // Arrays are not equal

        int[] s4 = { 1, 3, 2, 4, 5 };
        if (Arrays.equals(s1, s4)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        } // Arrays are not equal
    }
}

// The static method, binarySearch, is on the Arrays class.
// We can use this method, to test if a value is already in our array, but there
// are some important things to remember.
// First, the array has to be sorted.
// Second, if there are duplicate values in the array, there's no guarantee
// which one it'll match on.
// Finally, elements must be comparable. Trying to compare instances of
// different types, may lead to errors and invalid results.
// This method returns:
// The position of a match if found.
// It returns a -1 when no match was found.
// It's important to remember, that a positive number may not be the position of
// the first match.
// If your array has duplicate values, and you need to find the first element,
// other methods should be used.
