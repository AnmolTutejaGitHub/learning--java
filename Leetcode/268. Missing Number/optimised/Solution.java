//package Leetcode.268. Missing Number.optimised;
// optimised using cyclic sort
class Solution {
    public int missingNumber(int[] nums) {

        // for(int i=0; i<nums.length+1;i++){
        // boolean found=false;
        // for(int j=0;j<nums.length;j++){
        // if(i==nums[j]) {found=true;
        // break;}
        // }
        // if(!found) return i;
        // }
        // return -1;

        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i];

            if (nums[i] == nums.length) {
                i++;
                continue;
            }
            if (nums[i] != nums[correctIdx]) {

                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else
                i++;
        }
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] != a) {
                return a;
            }
        }
        return nums.length;
    }
}
