// package Leetcode.506. Relative Ranks;

import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer arr[] = new Integer[score.length];
        for (int i = 0; i < score.length; i++)
            arr[i] = score[i];
        Arrays.sort(arr, Collections.reverseOrder());
        HashMap<Integer, String> map = new HashMap<>();

        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                map.put(arr[i], "Gold Medal");
            else if (i == 1)
                map.put(arr[i], "Silver Medal");
            else if (i == 2)
                map.put(arr[i], "Bronze Medal");
            else
                map.put(arr[i], "" + (i + 1));
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(score[i]);
        }

        return res;
    }
}
