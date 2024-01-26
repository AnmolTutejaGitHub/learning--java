//package Leetcode.231. Power of Two;

class Solution {
    public boolean isPowerOfTwo(int n) {
        // int sqrt = Math.sqrt(n);
        // double sqrt = Math.sqrt(n);
        double x = Math.log(n) / Math.log(2);

        // return x == Math.floor(x); // integer // failing for larger values //
        // precision with math.fkloor is not exact
        // return x-Math.floor(x) ==0; // also failing for larger values

        return Math.abs(x - Math.floor(x)) < 1e-10; // 0.00000000000something then also true
    }
}
