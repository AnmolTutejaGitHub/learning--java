//package Leetcode.2206. Divide Array Into Equal Pairs;

import java.util.ArrayList;

class Solution {
    public boolean divideArray(int[] nums) {
        // int arr[] = new int[nums.length/2];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && nums[i] != Integer.MAX_VALUE && nums[j] != Integer.MIN_VALUE
                        && nums[i] != Integer.MIN_VALUE && nums[j] != Integer.MAX_VALUE) {
                    arr.add(nums[i]);
                    nums[i] = Integer.MAX_VALUE; // to eliminate used / checked elemenets
                    nums[j] = Integer.MIN_VALUE;
                    // System.out.println(arr);
                }
            }
        }
        return nums.length / 2 == arr.size();

    }
}