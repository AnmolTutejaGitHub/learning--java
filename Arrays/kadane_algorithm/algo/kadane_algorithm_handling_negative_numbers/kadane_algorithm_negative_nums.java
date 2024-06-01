package kadane_algorithm.algo.kadane_algorithm_handling_negative_numbers;

public class kadane_algorithm_negative_nums {
    // handling pure negative array like {-2,-1}
    public int maxSubArray(int[] nums) {

        if (nums.length == 1)
            return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);

            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

}
