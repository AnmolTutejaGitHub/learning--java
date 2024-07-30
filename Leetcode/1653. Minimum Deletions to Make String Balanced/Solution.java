//package Leetcode.1653. Minimum Deletions to Make String Balanced;

class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int acount = 0;
        int bcount = 0;
        int prefix_acount[] = new int[n];
        int suffix_bcount[] = new int[n];

        for (int i = 0; i < s.length(); i++) {
            prefix_acount[i] = acount;
            if (s.charAt(i) == 'a')
                acount++;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            suffix_bcount[i] = bcount;
            if (s.charAt(i) == 'b')
                bcount++;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            res = Math.min(res, n - (prefix_acount[i] + suffix_bcount[i]) - 1);
        }

        return res;
    }
}