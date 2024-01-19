//package Leetcode.2413. Smallest Even Multiple;

class Solution {
    public int smallestEvenMultiple(int n) {
        // boolean flag = false;
        int i = n;
        while (true) {
            if (i % 2 == 0 && i % n == 0)
                return i;
            i++;
        }
        // return -1;
    }
}
