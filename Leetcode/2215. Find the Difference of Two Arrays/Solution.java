//package Leetcode.2215. Find the Difference of Two Arrays;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            boolean toadd = true;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    toadd = false;
                    break;
                }
            }

            if (toadd && !ans1.contains(nums1[i]))
                ans1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            boolean toadd2 = true;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    toadd2 = false;
                    break;
                }
            }

            if (toadd2 && !ans2.contains(nums2[i]))
                ans2.add(nums2[i]);
        }

        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }
}
