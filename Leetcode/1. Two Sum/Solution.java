//package Leetcode.1. Two Sum;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] sortedArr = Arrays.copyOf(nums, nums.length);
        // Arrays.sort(sortedArr);

        // int i=0;
        // int j = nums.length-1;
        // while(i<j){
        // if(sortedArr[i]+sortedArr[j]==target) {

        // // i want to return index of original
        // // return new int[]{i,j};

        // // indexOf method on List not on array
        // // make List of integer not int
        // List<Integer> numsList =
        // Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new));

        // return new int[]{numsList.indexOf(sortedArr[i]),
        // numsList.indexOf(sortedArr[j])}; // find algo for this what if [3,3] // same
        // index
        // }

        // if(sortedArr[i]+sortedArr[j]>target) j-=1;
        // if(sortedArr[i]+sortedArr[j]<target) i+=1;

        // }
        // return new int[]{-1,-1}; //not found

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no solution is found
        return new int[] { -1, -1 };
    }
}
