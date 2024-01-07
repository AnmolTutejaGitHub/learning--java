// Binary search algorithm for sorted array 
package ClassArrays.BinarySearch;

public class BinarySearchAlgo {

    // Function to perform binary search on a sorted array
    static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        // not present
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 2, 5, 8, 12, 16, 23, 38, 45, 56, 72 };
        int targetElement = 16;

        int result = binarySearch(sortedArray, targetElement);

        if (result != -1)
            System.out.println("Element " + targetElement + " found at index " + result);
        else
            System.out.println("Element " + targetElement + " not found in the array.");
    }
}
