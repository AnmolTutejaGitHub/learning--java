//package Leetcode.2078. Two Furthest Houses With Different Colors;

class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        int localMax = 0;
        for (int i = 0; i < colors.length; i++) {
            localMax = 0;
            for (int j = colors.length - 1; j >= 0; j--) {
                if (colors[i] != colors[j])
                    if (localMax < Math.abs(i - j))
                        localMax = Math.abs(i - j);
            }
            if (localMax > max)
                max = localMax;
        }
        return max;
    }
}
