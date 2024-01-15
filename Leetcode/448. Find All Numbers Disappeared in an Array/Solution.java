//package Leetcode.448. Find All Numbers Disappeared in an Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // //ArrayList <Integer> contained = new ArrayList<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        // // int n = nums.length;
        // // for(int i=0;i<nums.length;i++){
        // // // if(ans.indexOf(j)<0)
        // // boolean notInArray = !Arrays.asList(nums).contains(nums[i]);

        // // if(notInArray) contained.add(nums[i]);
        // // }
        // boolean found;
        // for(int i=1;i<=nums.length;i++){
        // found = false;
        // for(int j=0;j<nums.length;j++){
        // if(nums[j]==i) {
        // found=true;
        // break;
        // }
        // }
        // if(!found) ans.add(i);
        // }
        // return ans ;

        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(nums); // sorting once
        for (int i = 1; i <= nums.length; i++) {
            boolean found = binarySearch(i, nums);
            if (!found) {
                ans.add(i);
            }

        }
        return ans;

    }

    public static boolean binarySearch(int target, int[] arr) {
        // Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid])
                return true;
            if (target > arr[mid])
                left = mid + 1;
            if (target < arr[mid])
                right = mid - 1;
        }
        return false;
    }
}
