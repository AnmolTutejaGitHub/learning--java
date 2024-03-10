//package Leetcode.349. Intersection of Two Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int ele : nums1) {
            set.add(ele);
        }

        ArrayList<Integer> intersect = new ArrayList<>();

        for (int ele : nums2) {
            if (set.contains(ele) && !(intersect.contains(ele))) {
                intersect.add(ele);
            }
        }

        int[] ans = new int[intersect.size()];

        for (int i = 0; i < intersect.size(); i++) {
            ans[i] = intersect.get(i);
        }

        return ans;
    }
}
