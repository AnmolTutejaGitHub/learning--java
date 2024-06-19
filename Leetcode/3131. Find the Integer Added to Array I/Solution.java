//package Leetcode.3131. Find the Integer Added to Array I;

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // return nums2[0]-nums1[0];
        int min1 = nums1[0];
        int min2 = nums2[0];

        for (int i = 0; i < nums1.length; i++) {
            min1 = Math.min(nums1[i], min1);
            min2 = Math.min(nums2[i], min2);
        }
        return min2 - min1;
    }
}
