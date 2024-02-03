package Recursion;

// binary search using recursion 
public class binary_search_using_recursion {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 88, 90 };
        int target = 88;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }

        // if (target > arr[mid]) {
        // return search(arr, target, mid + 1, end);
        // }

        // otherwise target lies on RHS (target < arr[mid])
        return search(arr, target, mid + 1, end);

    }
}
