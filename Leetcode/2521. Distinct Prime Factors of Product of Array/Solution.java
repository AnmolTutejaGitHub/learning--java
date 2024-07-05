//package Leetcode.2521. Distinct Prime Factors of Product of Array;

import java.util.*;

class Solution {
    boolean vis[] = new boolean[1001];

    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!vis[i] && isPrime(i)) {
                set.add(i);
                vis[i] = true;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        if (!vis[j] && isPrime(j))
                            set.add(j);
                        if (!vis[i / j] && isPrime(i / j))
                            set.add(i / j);
                        vis[j] = true;
                        vis[i / j] = true;
                    }
                }
            }
        }
        return set.size();
    }

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}