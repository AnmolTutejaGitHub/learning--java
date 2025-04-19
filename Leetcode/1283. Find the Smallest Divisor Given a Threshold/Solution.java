//package Leetcode.1283. Find the Smallest Divisor Given a Threshold;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(i,max);
        }

        int s = 1;
        int e = max;
        int res = -1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(calSum(nums,mid)<=threshold){
                res = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return res;
    }

    public int calSum(int []arr,int div){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            int res = arr[i]/div;
            if(arr[i]%div!=0) res+=1;
            sum+=res;
        }
        return sum;
    }
}