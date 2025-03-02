//package Leetcode.2570. Merge Two 2D Arrays by Summing Values;

import java.util.ArrayList;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> ls = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                ls.add(new int[] { nums1[i][0], nums1[i][1] + nums2[j][1] });
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                ls.add(nums1[i++]);
            } else
                ls.add(nums2[j++]);
        }
        while (i < nums1.length) {
            ls.add(nums1[i++]);
        }

        while (j < nums2.length) {
            ls.add(nums2[j++]);
        }

        int[][] res = new int[ls.size()][2];
        for (int k = 0; k < ls.size(); k++) {
            res[k] = ls.get(k);
        }

        return res;
    }
}