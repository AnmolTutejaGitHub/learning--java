//package Leetcode.2958. Length of Longest Subarray With at Most K Frequency;

import java.util.HashMap;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start = 0;
        int MaxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int end = 0; end < nums.length; end++) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            while (map.get(nums[end]) > k && start <= end) {
                // if(nums[start]==nums[end]) map.put(nums[end],map.get(nums[end])-1);
                map.put(nums[start], map.get(nums[start]) - 1);
                start++;
            }

            MaxLen = Math.max(MaxLen, end - start + 1);
        }
        return MaxLen;
    }
}

// Intution : maintain a sliding window in which freq of each element <=k
// use hashmap for freq
// if feq of ele in sliding window > k increment start till freq of nums[end] is
// less than= k
// why nums[end] freq as freq of ele in sliding window before is already<=k
