//package Leetcode.2683. Neighboring Bitwise XOR;

class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for (int i = 0; i < derived.length; i++) {
            xor ^= derived[i];
        }
        return xor == 0;
    }
}