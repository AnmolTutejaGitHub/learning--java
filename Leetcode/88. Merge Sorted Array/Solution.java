//package Leetcode.88. Merge Sorted Array;

//import java.util.Arrays;

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         int j = 0;
//         for (int i = 0; i < n; i++) {
//             nums1[i + m] = nums2[i];
//         }

//         Arrays.sort(nums1);
//     }
// }

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[] = new int[m + n];

        int i = 0;
        int j = 0;
        int idx = 0;
        if (n == 0 || n > nums2.length)
            return;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                ans[idx++] = nums1[i++];
            else
                ans[idx++] = nums2[j++];
        }
        while (i < m) {
            ans[idx++] = nums1[i++];
        }
        while (j < n) {
            ans[idx++] = nums2[j++];
        }

        i = 0;
        while (i < nums1.length)
            nums1[i] = ans[i++];
    }
}