package kadane_algorithm.algo.kadane_algorithm;

// 
// max sub array sum : kadane's algorithm 
public class kadane_algorithm {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(kadane(arr)); // 7

    }

    public static int kadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

}
