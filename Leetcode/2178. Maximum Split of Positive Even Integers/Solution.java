// package Leetcode.2178. Maximum Split of Positive Even Integers;

import java.util.*;

class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ls = new ArrayList<>();
        if (finalSum % 2 != 0)
            return ls;
        long even = 2;
        while (finalSum >= even) {
            finalSum -= even;
            ls.add(even);
            even += 2;
        }

        // System.out.println(ls);
        int size = ls.size();
        if (finalSum > 0)
            ls.set(size - 1, ls.get(size - 1) + finalSum);
        return ls;
    }
}
