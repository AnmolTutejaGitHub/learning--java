//package Leetcode.1460. Make Two Arrays Equal by Reversing Subarrays;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int freq[] = new int[1001];

        for (int i = 0; i < arr.length; i++) {
            freq[target[i]]++;
            freq[arr[i]]--;
        }

        for (int i = 0; i < 1001; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }
}