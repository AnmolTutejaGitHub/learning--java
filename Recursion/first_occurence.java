package Recursion;

// WAF to find first occurence of an element in an array using recursion 
public class first_occurence {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 7, 9, 3, 5, 9 };
        int key = 5;
        System.out.println(firstOccurence(arr, key, 0)); // 2
    }

    public static int firstOccurence(int arr[], int key, int i) {

        // base case
        if (i == arr.length)
            return -1; // notic arr.length not arr,length-1

        if (arr[i] == key)
            return i;

        return firstOccurence(arr, key, i + 1);

    }
}
