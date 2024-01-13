//package Leetcode.1437. Check If All 1's Are at Least Length K Places Away;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1)
                return true;
            int count = 0;
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j == nums.length - 1 && nums[j] != 1)
                        return true;
                    if (nums[j] == 1)
                        break;

                    count++;
                }
            }

            if (nums[i] != 0 && count < k)
                return false;
        }
        return true;
    }
}