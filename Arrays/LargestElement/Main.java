// finding largest element in the array
package LargestElement;

public class Main {
    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 20, 15 };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max); // 20
    }
}

// time complexity -- > O(n)
