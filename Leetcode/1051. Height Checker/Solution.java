
//package Leetcode.1051. Height Checker;
import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // intution --> bubble sorting then tell no of elements swapped

        int[] cpyHeight = Arrays.copyOf(heights, heights.length);
        Arrays.sort(cpyHeight);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != cpyHeight[i])
                count++;
        }

        return count;

    }
}