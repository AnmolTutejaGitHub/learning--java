//package Leetcode.1663. Smallest String With A Given Numeric Value;

class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder res = new StringBuilder();
        // int ascii = 122;
        int e = 26;

        while (k > 0 && n > 0 && e > 0) {
            if (k - e >= 0 && n - 1 <= k - e) {
                res.append((char) (e + 'a' - 1));
                k = k - e;
                n--;
                if (k <= 26)
                    e = k;
                else
                    e = 26;
            } else
                e--;
        }
        return res.reverse().toString();
    }
}

// 'z' --> 122
// as per que z - 'a' = 26;
// z = 26+a
// 26 here means e
// ascii to add here means z
