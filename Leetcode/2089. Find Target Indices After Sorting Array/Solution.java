//package Leetcode.2089. Find Target Indices After Sorting Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                ans.add(i);
        }
        return ans;
    }
}