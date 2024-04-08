//package Leetcode.1248. Count Number of Nice Subarrays;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }

    public int atmost(int[] nums, int k) {
        int count = 0;
        int s = 0;
        int subcount = 0;

        for (int e = 0; e < nums.length; e++) {
            if (nums[e] % 2 != 0)
                count++;

            while (count > k) {
                if (nums[s] % 2 != 0)
                    count--;
                s++;
            }
            subcount += e - s + 1;
        }
        return subcount;
    }
}
