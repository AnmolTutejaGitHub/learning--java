//package Leetcode.350. Intersection of Two Arrays II;

import java.util.ArrayList;
import java.util.List;

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         for (int i = 0; i < nums1.length; i++) {
//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums1[i] == nums2[j]) {
//                     ans.add(nums1[i]);
//                     nums1[i] = Integer.MAX_VALUE;
//                     nums2[j] = Integer.MIN_VALUE;
//                     break;
//                 }
//             }
//         }
//         // Integer [] arr = ans.toArray(new Integer[ans.size()]);

//         int[] arr = new int[ans.size()];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = ans.get(i);
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq1[] = new int[1001];
        int freq2[] = new int[1001];
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            freq1[nums1[i]]++;
        }

        for (int i = 0; i < nums2.length; i++) {
            freq2[nums2[i]]++;
        }

        int i = 0;
        while (i < freq1.length) {
            if (freq1[i] != 0 && freq2[i] != 0) {
                int j = 0;
                while (j < Math.min(freq1[i], freq2[i])) {
                    arr.add(i);
                    j++;
                }
            }
            i++;
        }

        int res[] = new int[arr.size()];
        int j = 0;
        for (i = 0; i < arr.size(); i++)
            res[j++] = arr.get(i);
        return res;
    }
}
