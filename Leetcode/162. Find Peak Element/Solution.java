// package Leetcode.162. Find Peak Element;

// class Solution {
// public int findPeakElement(int[] nums) {
// // if(nums.length==1) return 0;
// // if(nums.length==2) return nums[0]>nums[1]? 0: 1;

// int ans = -1;
// for (int i = 0; i < nums.length; i++) {
// int numsi_n1 = Integer.MIN_VALUE; // nums[i-1]
// int numsi_p1 = Integer.MIN_VALUE; // nums[i+1]

// // if(i-1>=0 && i+1<nums.length && nums[i-1]<nums[i]&& nums[i+1]<nums[i])
// return
// // i;
// if (i - 1 >= 0)
// numsi_n1 = nums[i - 1];
// if (i + 1 < nums.length)
// numsi_p1 = nums[i + 1];

// if (numsi_n1 < nums[i] && numsi_p1 < nums[i])
// return i;
// }
// // return -1; // failing test case [-2147483648]
// return 0;
// }
// }

class Solution {
    public int findPeakElement(int[] nums) {
        int s = 1;
        int e = nums.length - 2;
        if (nums.length == 1)
            return 0;
        // if(nums.length==2) {if (nums[1]>nums[0]) {return 1;} else return 0;}
        if (nums[0] > nums[1])
            return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;

        while (s <= e) {
            int m = (s + e) / 2;

            if (nums[m] > nums[m + 1] && nums[m] > nums[m - 1])
                return m;
            else if (nums[m] > nums[m - 1])
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;
    }
}