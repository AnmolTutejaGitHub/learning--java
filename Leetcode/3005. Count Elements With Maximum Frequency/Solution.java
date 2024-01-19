//package Leetcode.3005. Count Elements With Maximum Frequency;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        // int freq =0;
        int[] freq = new int[nums.length];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
            freq[i] = count;
        }

        int countMax = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                countMax = 0;
                max = freq[i];
            }
            if (max == freq[i])
                countMax++;
        }
        return countMax;

    }
}
