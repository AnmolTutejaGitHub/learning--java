//package Leetcode.3115. Maximum Prime Difference;
class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int first = -1;
        int last = -1;
        boolean pass = false;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                if (!pass) {
                    first = i;
                    pass = true;
                }
                last = i;
            }
        }
        return last - first;
    }

    public boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
