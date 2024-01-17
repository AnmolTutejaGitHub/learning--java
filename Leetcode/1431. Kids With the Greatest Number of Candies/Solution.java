//package Leetcode.1431. Kids With the Greatest Number of Candies;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        ArrayList<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
