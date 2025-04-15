//package Leetcode.31. Next Permutation;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+1<nums.length && nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot==-1) {
            Arrays.sort(nums);
            return;
        }

        for(int i=nums.length-1;i>=pivot;i--){
            if(nums[i]>nums[pivot]) {
                swap(nums,pivot,i);
                break;
            }
        }
        Arrays.sort(nums, pivot + 1, nums.length);
    }

    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}