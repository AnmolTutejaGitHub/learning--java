import java.util.Arrays;
//Swap elements adjacent to each other in an array

public class swipeArrayElements {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length - 1; i += 2) { // The i += 2 is used to ensure that you swap elements that are
                                                      // adjacent to each other in the array.
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}


///
// public class ArrayPrintExample {
//     public static void main(String[] args) {
//         // Example array
//         int[] arr = {1, 2, 3, 4, 5};

//         // Print the array without using Arrays.toString()
//         System.out.print("[");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//             if (i < arr.length - 1) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.println("]");
//     }
// }

