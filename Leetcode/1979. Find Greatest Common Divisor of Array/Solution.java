//package Leetcode.1979. Find Greatest Common Divisor of Array;

class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }
        return gcd(max, min);

    }

    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a; i++) {

            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
