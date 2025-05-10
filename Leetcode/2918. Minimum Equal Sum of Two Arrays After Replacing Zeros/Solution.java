//package Leetcode.2918. Minimum Equal Sum of Two Arrays After Replacing Zeros;

class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum_1 = 0;
        long zero_1 = 0;

        long sum_2 = 0;
        long zero_2 = 0;

        for(int i=0;i<nums1.length;i++){
            sum_1+=nums1[i];
            if(nums1[i]==0) zero_1++;
        }

        for(int i=0;i<nums2.length;i++){
            sum_2+=nums2[i];
            if(nums2[i]==0) zero_2++;
        }

        sum_1+=zero_1;
        sum_2+=zero_2;

        if(sum_1==sum_2) return sum_1;

        long diff = sum_1 - sum_2;
        if(diff<0){
            if(zero_1==0) return -1;
            return sum_2;
        }
        else{
            if(zero_2==0) return -1;
            return sum_1;
        }
    }
}
