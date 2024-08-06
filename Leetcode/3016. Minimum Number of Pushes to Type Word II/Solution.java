//package Leetcode.3016. Minimum Number of Pushes to Type Word II;

import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int count = 0;
        int pushes = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            pushes += (freq[i]) * ((count / 8) + 1);
            count++;
        }
        return pushes;
    }
}