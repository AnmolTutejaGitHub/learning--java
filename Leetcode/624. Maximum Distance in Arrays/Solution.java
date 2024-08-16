//package Leetcode.624. Maximum Distance in Arrays;

import java.util.*;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        int maxabs = 0;

        for (int i = 1; i < arrays.size(); i++) {

            int size = arrays.get(i).size();

            maxabs = Math.max(maxabs, Math.abs(min - arrays.get(i).get(size - 1)));
            maxabs = Math.max(maxabs, Math.abs(max - arrays.get(i).get(0)));

            max = Math.max(max, arrays.get(i).get(size - 1));
            min = Math.min(min, arrays.get(i).get(0));
        }

        return maxabs;
    }
}
