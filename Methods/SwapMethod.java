public class SwapMethod {

    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

    }

    public static void main(String[] args) {
        int a = 12;
        int b = 45;
        swap(a, b); // will not work as not passed by reference
        System.out.println(a); // 12
    }
}

// we can achieve swap using arrays :
// public class SwapExample {

// public static void main(String[] args) {
// int[] values = {5, 10};

// System.out.println("Before swapping: values[0] = " + values[0] + ", values[1]
// = " + values[1]);

// // Call the swap function
// swap(values, 0, 1);

// System.out.println("After swapping: values[0] = " + values[0] + ", values[1]
// = " + values[1]);
// }

// public static void swap(int[] array, int index1, int index2) {
// // Use a temporary variable to swap the values
// int temp = array[index1];
// array[index1] = array[index2];
// array[index2] = temp;

// System.out.println("Inside the swap function: array[0] = " + array[0] + ",
// array[1] = " + array[1]);
// }
// }
