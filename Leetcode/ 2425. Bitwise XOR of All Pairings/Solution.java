//package Leetcode. 2425. Bitwise XOR of All Pairings;

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        if (l1 % 2 == 0 && l2 % 2 == 0)
            return 0;
        if (l1 % 2 == 1 && l2 % 2 == 0)
            return xor(nums2);
        if (l1 % 2 == 0 && l2 % 2 == 1)
            return xor(nums1);
        return xor(nums1) ^ xor(nums2);
    }

    public int xor(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }
}