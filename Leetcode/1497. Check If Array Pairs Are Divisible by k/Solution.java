//package Leetcode.1497. Check If Array Pairs Are Divisible by k;

class Solution {
    public boolean canArrange(int[] arr, int k) {
        int remFreq[] = new int[k];

        for (int i = 0; i < arr.length; i++) {
            int rem = arr[i] % k;
            if (rem < 0)
                rem += k;

            remFreq[rem]++;
        }

        for (int i = 0; i <= k / 2; i++) {
            if (i == 0 && remFreq[i] % 2 != 0)
                return false;
            else if (i != 0 && remFreq[i] != remFreq[k - i])
                return false;
        }
        return true;
    }
}