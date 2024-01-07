// print all subarrays of a given array 

// subaaray --> A continuous part of array
//example 
// array --> [2,4,6,8,10]
//All subarrays --> 
// 2   2,4  2,4,6  2,4,6,8   2,4,6,8,10
//4   4,6   4,6,8  4,6,8,10
//6   6,8   6,8,10  
//8   8,10
package subarray;

public class PrintSubarrays {
    public static void printSubarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        printSubarrays(arr);
    }
}
