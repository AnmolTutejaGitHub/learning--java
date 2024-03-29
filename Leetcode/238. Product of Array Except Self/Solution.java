//package Leetcode.238. Product of Array Except Self;

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] leftproduct = new int[nums.length];
//         int[] rightproduct = new int[nums.length];
//         int[] answer = new int[nums.length];

//         for (int i = 0; i < nums.length; i++) {
//             if (i == 0)
//                 leftproduct[i] = 1;
//             else
//                 leftproduct[i] = leftproduct[i - 1] * nums[i - 1];
//         }

//         for (int i = nums.length - 1; i >= 0; i--) {
//             if (i == nums.length - 1)
//                 rightproduct[i] = 1;
//             else
//                 rightproduct[i] = rightproduct[i + 1] * nums[i + 1];
//         }

//         for (int i = 0; i < nums.length; i++) {
//             answer[i] = leftproduct[i] * rightproduct[i];
//         }
//         return answer;

//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        int leftProduct = 1;
        int rightProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                leftProduct = 1;
            else
                leftProduct = leftProduct * nums[i - 1];
            ans[i] = leftProduct;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1)
                rightProduct = 1;
            else
                rightProduct = rightProduct * nums[i + 1];
            ans[i] *= rightProduct;
        }

        return ans;
    }
}