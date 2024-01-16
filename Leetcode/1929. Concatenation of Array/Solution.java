//package Leetcode.1929. Concatenation of Array;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int j = ans.length / 2 - 1;
        for (int i = 0; i < ans.length / 2; i++) {
            ans[i] = nums[i];
            ans[ans.length - 1 - i] = nums[j--];
        }
        return ans;
    }
}
