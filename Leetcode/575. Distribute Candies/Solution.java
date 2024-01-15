
//package Leetcode.575. Distribute Candies;
import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> sol = new HashSet<>();
        for (int ele : candyType) {
            sol.add(ele);
        }
        if (sol.size() == candyType.length / 2)
            return sol.size();
        if (sol.size() < candyType.length / 2)
            return sol.size();
        if (sol.size() > candyType.length / 2)
            return candyType.length / 2;

        return -1;
    }
}
///

////
/////
///
