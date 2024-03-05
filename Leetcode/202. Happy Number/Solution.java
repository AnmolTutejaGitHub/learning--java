//package Leetcode.202. Happy Number;

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> visited = new HashSet<>();

        while (n != 1) {
            if (visited.contains(sq(n)))
                return false;
            visited.add(n);
            n = sq(n);
        }

        return n == 1;

    }

    public int sq(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}
