// class Solution {
//     public int[] runningSum(int[] nums) {
//         // int first = nums[0];
//         int[] ans = new int[nums.length];

//         for (int i = 0; i < nums.length; i++) {
//             // ans[i]=nums[0]; then start from j=1;
//             for (int j = 0; j <= i; j++) {
//                 ans[i] += nums[j];
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] runningSum(int[] nums) {
        int prefix = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            ans[i] = prefix;
        }
        return ans;
    }
}