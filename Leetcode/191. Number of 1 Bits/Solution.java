//package Leetcode.191. Number of 1 Bits;
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }
}