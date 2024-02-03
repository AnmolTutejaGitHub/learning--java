package Recursion;

// check if array is sorted in ascending order 
public class is_array_sorted_recursion {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 8, 9, 12 };
        System.out.print(isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr, int i) {

        // base case
        if (i == arr.length - 1)
            return true;

        if (arr[i] > arr[i + 1])
            return false;

        return isSorted(arr, i + 1);

    }
}
