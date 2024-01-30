//package Leetcode.2535. Difference Between Element Sum and Digit Sum of an Array;

class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digiSum = 0;

        for (int i = 0; i < nums.length; i++) {
            eleSum += nums[i];

            while (nums[i] > 0) {
                int rem = nums[i] % 10;
                digiSum += rem;
                nums[i] = nums[i] / 10;
            }
        }
        return Math.abs(digiSum - eleSum);

    }

}
