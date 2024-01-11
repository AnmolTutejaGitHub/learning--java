//package Leetcode.485. Max Consecutive Ones;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int localMax = 0;
        for (int i = 0; i < nums.length; i++) {
            localMax = 0;
            while (i < nums.length - 1 && nums[i] == nums[i + 1] && nums[i] == 1) {
                localMax++;
                i++;
            }
            if (localMax > 0 || nums[i] == 1) { // 0r condition for case(1,0)
                localMax += 1; // for say '1,1,1,0' +1 for last'1'
            }

            if (localMax > max)
                max = localMax;
        }

        // handling for array of 1 element
        if (nums.length == 1) {
            max = (nums[0] == 1 ? 1 : 0);
        }

        return max;
    }
}
