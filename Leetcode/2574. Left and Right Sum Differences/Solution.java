//package Leetcode.2574. Left and Right Sum Differences;

// class Solution {
//     public int[] leftRightDifference(int[] nums) {

//         int[] ans = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             int rightsum = 0;
//             int leftsum = 0;
//             // int k = nums.length-1;
//             // for(int j=0;j<i;j++){
//             for (int j = 0; j < i; j++) {
//                 leftsum += nums[j];
//             }
//             for (int k = i + 1; k < nums.length; k++) {
//                 rightsum += nums[k];
//             }
//             // }
//             ans[i] = Math.abs(leftsum - rightsum);
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] leftRightDifference(int[] nums) {

        int[] ans = new int[nums.length];
        int ls = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ls;
            ls += nums[i];
        }

        int rs = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = Math.abs(ans[i] - rs);
            rs += nums[i];
        }
        return ans;
    }
}
