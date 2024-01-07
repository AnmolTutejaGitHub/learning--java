// if mutiple elements in the array equal to target 
package ClassArrays.Searching.BinarySearch.Algo;

public class BinarySearch {

    static int findFirstOccurrence(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                // Continue searching in the left subarray for the first occurrence
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 2, 5, 8, 12, 16, 16, 23, 38, 45, 56, 72 };
        int targetElement = 16;

        int result = findFirstOccurrence(sortedArray, targetElement);

        if (result != -1)
            System.out.println("First occurrence of " + targetElement + " found at index " + result);
        else
            System.out.println(targetElement + " not found in the array.");
    }
}
