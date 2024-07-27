//package Leetcode.274. H-Index;

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        int hIndex = -1;
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (n - i >= citations[i])
                hIndex = Math.max(citations[i], hIndex);
            else if (n - i < citations[i])
                hIndex = Math.max(hIndex, n - i);
        }

        if (citations[0] > n)
            return n;
        return hIndex;
    }
}
