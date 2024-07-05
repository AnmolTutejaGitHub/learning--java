//package Leetcode.70. Climbing Stairs;

class Solution {
    public int climbStairs(int n) {
        // if(n==1 || n==2) return n;
        // return climbStairs(n-1)+climbStairs(n-2);

        if (n <= 2)
            return n;
        int arr[] = new int[3];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 0; i < n; i++) {
            arr[2] = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = arr[2];
        }
        return arr[2];
    }
}
