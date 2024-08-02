//package Leetcode.2134. Minimum Swaps to Group All 1's Together II;

class Solution {
    public int minSwaps(int[] nums) {
        int count_1 = 0;
        for (int i : nums) {
            if (i == 1)
                count_1++;
        }

        int s = 0;
        int count = 0;
        int swap = Integer.MAX_VALUE;
        int M = nums.length;

        for (int e = 0; e < 2 * nums.length - 1; e++) {
            if (nums[e % M] == 1)
                count++;

            if (e - s + 1 == count_1) {
                swap = Math.min(swap, count_1 - count);
                if (nums[s % M] == 1)
                    count--;
                s++;
            }
        }
        if (swap == Integer.MAX_VALUE)
            return 0;
        return swap;
    }
}
