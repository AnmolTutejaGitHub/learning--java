//package Leetcode.2455. Average Value of Even Numbers That Are Divisible by Three;

class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                sum += nums[i];
                count++;
            }
        }
        // return sum / ((""+sum).length());

        count = count > 0 ? count : 1;
        return sum / count;
    }
}