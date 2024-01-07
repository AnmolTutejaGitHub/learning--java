// I tried finding largest element using two pointers approach
// I don't know if this is efficient 
package LargestElement;

public class TwoPointersApproch {
    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 20, 15 };

        int maxi = Integer.MIN_VALUE;
        int maxj = Integer.MIN_VALUE;
        int j = array.length - 1;
        for (int i = 0; i <= array.length / 2; i++) {
            if (array[i] > maxi) {
                maxi = array[i];
            }
            if (array[j] > maxj) {
                maxj = array[j];
            }
            j--;
        }
        if (maxi > maxj) {
            System.out.println(maxi); // 20
        } else
            System.out.println(maxj);
    }
}
