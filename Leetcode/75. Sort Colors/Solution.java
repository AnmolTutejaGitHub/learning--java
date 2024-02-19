//package Leetcode.75. Sort Colors;
// dutch national flag algorithm 
class Solution {
    public void sortColors(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        // for(int j=0;j<nums.length;j++){
        // if(j+1<nums.length && nums[j]>nums[j+1]){

        // int temp = nums[j];
        // nums[j] = nums[j+1];
        // nums[j+1] = temp;
        // }
        // }
        // }
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}