//package Leetcode.2044. Count Number of Maximum Bitwise-OR Subsets;
class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int MaxOr = 0;
        for (int num : nums)
            MaxOr = MaxOr | num;
        int count[] = new int[1];
        backtrack(0, nums, 0, count, MaxOr);
        return count[0];
    }

    public void backtrack(int index, int[] nums, int CurrOr, int[] count, int MaxOr) {
        if (index == nums.length) {
            if (CurrOr == MaxOr && nums.length != 0)
                count[0]++;
            return;
        }

        backtrack(index + 1, nums, CurrOr | nums[index], count, MaxOr);
        backtrack(index + 1, nums, CurrOr, count, MaxOr);
    }
}
