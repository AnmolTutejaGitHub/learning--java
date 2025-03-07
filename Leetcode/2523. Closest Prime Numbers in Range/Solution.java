//package Leetcode.2523. Closest Prime Numbers in Range;

import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean primes[] = sieve(right);
        ArrayList<Integer> primesInRange = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (primes[i])
                primesInRange.add(i);
        }

        if (primesInRange.size() < 2)
            return new int[] { -1, -1 };
        int res[] = new int[2];
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < primesInRange.size() - 1; i++) {
            int currDiff = primesInRange.get(i + 1) - primesInRange.get(i);
            if (currDiff < diff) {
                res[0] = primesInRange.get(i);
                res[1] = primesInRange.get(i + 1);
                diff = currDiff;
            }
        }
        return res;
    }

    public boolean[] sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int p = i * i; p <= n; p += i) {
                    primes[p] = false;
                }
            }
        }
        return primes;
    }
}