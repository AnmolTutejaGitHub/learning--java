//package Leetcode.2149. Rearrange Array Elements by Sign;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int posIndex = 0;
        int[] neg = new int[nums.length / 2];
        int negIndex = 0;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                pos[posIndex++] = nums[i];
            if (nums[i] < 0)
                neg[negIndex++] = nums[i];
        }

        posIndex = 0;
        negIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                ans[i] = pos[posIndex++];
            if (i % 2 != 0)
                ans[i] = neg[negIndex++];
        }
        return ans;
    }
}
