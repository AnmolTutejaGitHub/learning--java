//package Leetcode.2605. Form Smallest Number From Two Digit Arrays;

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        // for(int i=0;<)
        int smallest1 = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        int cmin = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            if (smallest1 > nums1[i])
                smallest1 = nums1[i];

            // if common ellement --> test case bug

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (cmin > nums1[i]) {
                        cmin = nums1[i];
                    }
                }

            }
        }
        if (cmin != Integer.MAX_VALUE)
            return cmin;

        for (int i = 0; i < nums2.length; i++) {
            if (smallest2 > nums2[i])
                smallest2 = nums2[i];
        }

        int tens = Math.min(smallest1, smallest2);
        int ones = Math.max(smallest1, smallest2);

        return tens * 10 + ones;
    }
}
