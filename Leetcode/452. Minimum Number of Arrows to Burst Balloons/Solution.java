//package Leetcode.452. Minimum Number of Arrows to Burst Balloons;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        int ans = 0;
        Arrays.sort(points, Comparator.comparingInt(arr -> arr[0]));
        boolean passed;

        for (int i = 0; i < points.length; i++) {
            passed = false;
            ans++;
            int rightbound = points[i][1];
            while (i < points.length && points[i][0] <= rightbound) {
                passed = true;
                rightbound = Math.min(points[i][1], rightbound);
                i++;
            }
            if (passed)
                i--;
        }
        return ans;
    }
}
