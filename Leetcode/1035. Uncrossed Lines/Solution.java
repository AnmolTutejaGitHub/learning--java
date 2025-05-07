//package Leetcode.1035. Uncrossed Lines;

import java.util.Arrays;

class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] memo = new int[nums1.length][nums2.length];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return memorization(nums1, nums2, 0, 0, memo);
    }

    public int memorization(int[] nums1, int[] nums2, int idx1, int idx2, int[][] memo) {
        if (idx1 >= nums1.length || idx2 >= nums2.length) return 0;
        if (memo[idx1][idx2] != -1) return memo[idx1][idx2];

        boolean Match = false;
        int matchIdx = -1;
        int match = 0;
        for (int i = idx2; i < nums2.length; i++) {
            if (nums2[i] == nums1[idx1]) {
                Match = true;
                matchIdx = i;
                break;
            }
        }

        int notMatch = memorization(nums1,nums2,idx1+1,idx2,memo);
        if(Match) match = 1+memorization(nums1,nums2,idx1+1,matchIdx+1,memo);
        memo[idx1][idx2] = Math.max(match, notMatch);
        return memo[idx1][idx2];
    }
}
