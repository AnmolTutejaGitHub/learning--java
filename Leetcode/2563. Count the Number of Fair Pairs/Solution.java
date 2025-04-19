import java.util.*;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count[] = new long[1];
        search(nums,lower,upper,0,nums.length-1,count);
        return count[0];
    }

    public void search(int []nums,int lower,int upper,int s,int e,long[]count){
        if(s>=nums.length || e<0) return;
        if(s>=e) return;

        int sum = nums[s]+nums[e];
        if(inRange(lower,upper,sum)){
            count[0]+=countBetween(nums,lower,upper,s,e);
            search(nums,lower,upper,s+1,e,count);
        }
        else if(sum>upper) search(nums,lower,upper,s,e-1,count);
        else search(nums,lower,upper,s+1,e,count);
    }

    public boolean inRange(int l,int u,int sum){
        return l<=sum && sum<=u;
    }

    public int countBetween(int[] nums, int l, int u, int s, int e) {
        int low = -1;
        int high = -1;

        int lo = s+1;
        int hi = e;

        while (lo <= hi) {
            int m =lo+(hi-lo)/2;
            if (nums[s]+nums[m]>=l) {
                low = m;
                hi = m-1;
            } else lo = m+1;
        }

        lo = s+1; 
        hi = e;

        while (lo <= hi) {
            int m =lo+(hi-lo)/2;
            if (nums[s]+nums[m]<=u) {
                high = m;
                lo = m+1;
            } else hi = m-1;
        }

        if (low!=-1 && high!=-1 && low<=high) return high-low+1;
        return 0;
    }
}