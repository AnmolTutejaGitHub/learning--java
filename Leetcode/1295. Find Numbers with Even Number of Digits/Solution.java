//package Leetcode.1295. Find Numbers with Even Number of Digits;

// class Solution {
//     public int findNumbers(int[] nums) {
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (("" + nums[i]).length() % 2 == 0) {
//                 count++;
//             }

//         }
//         return count;
//     }
// }

class Solution {
    public int findNumbers(int[] nums) {
        int count =0 ;
        for(int i=0;i<nums.length;i++){
            if(digits(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
    public int digits(int n){
        return (int) Math.log10(n)+1;
    }
}