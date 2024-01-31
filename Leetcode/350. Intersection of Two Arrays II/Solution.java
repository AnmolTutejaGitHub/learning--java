//package Leetcode.350. Intersection of Two Arrays II;

import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans.add(nums1[i]);
                    nums1[i] = Integer.MAX_VALUE;
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        // Integer [] arr = ans.toArray(new Integer[ans.size()]);

        int[] arr = new int[ans.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
