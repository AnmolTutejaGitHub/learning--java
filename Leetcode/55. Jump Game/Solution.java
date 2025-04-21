//package Leetcode.55. Jump Game;

class Solution {
    public boolean canJump(int[] nums) {
        int jumpUpTo = nums[0];
        for(int i=1;i<nums.length;i++){
            if(i > jumpUpTo) return false;
            jumpUpTo = Math.max(jumpUpTo,i+nums[i]);
        }
        return true;
    }
}
