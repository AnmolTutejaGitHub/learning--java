package Recursion;

// last occurence of an element in array
public class last_occurence {
    public static void main(String[] args) {
        int[] arr = { 5, 5, 5, 5 }; // 3
        System.out.println(lastOccurence(arr, 5, 0));
    }

    public static int lastOccurence(int[] arr, int key, int i) {

        // base condition
        if (i == arr.length)
            return -1;

        int isFound = lastOccurence(arr, key, i + 1);

        if (isFound != -1)
            return isFound;

        // check with self
        if (arr[i] == key) {
            return i;
        }

        return isFound;

    }
}
