//package Leetcode.1389. Create Target Array in the Given Order;

import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans.get(i);
        }

        return nums;
    }
}