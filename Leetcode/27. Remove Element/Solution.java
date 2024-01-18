//package Leetcode.27. Remove Element;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {

            // intution : sorting Integer.MAX_VALUE to end of array
            for (int j = 0; j < nums.length; j++) {

                if (j + 1 < nums.length && nums[j] == Integer.MAX_VALUE) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
        return nums.length - count;

    }
}
