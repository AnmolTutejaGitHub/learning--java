//package Leetcode.1011. Capacity To Ship Packages Within D Days;

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for(int i : weights) sum+=i;

        int s = 1;
        int e = sum;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(canShip(weights,mid,days)){
                ans = mid;
                e = mid-1;
            }else s = mid+1;
        }
        return ans;
    }

    public boolean canShip(int []arr,int capacity,int days){
        int one_shipment_wt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>capacity) return false;

            if(one_shipment_wt+arr[i]<=capacity){
                one_shipment_wt+=arr[i];
            }else {
                days--;
                one_shipment_wt=arr[i];
            }
        }
        if(one_shipment_wt>0) days--;
        return days>=0;
    }
}