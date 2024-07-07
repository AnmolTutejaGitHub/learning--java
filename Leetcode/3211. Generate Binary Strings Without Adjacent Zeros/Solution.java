//package Leetcode.3211. Generate Binary Strings Without Adjacent Zeros;

import java.util.*;

class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        backtrack(0, n, "", res);
        return res;
    }

    public void backtrack(int idx, int n, String p, List<String> res) {
        if (idx == n) {
            res.add(p);
            return;
        }

        if (p.length() >= 1 && p.charAt(p.length() - 1) == '0')
            backtrack(idx + 1, n, p + "1", res);
        else {
            backtrack(idx + 1, n, p + "0", res);
            backtrack(idx + 1, n, p + "1", res);
        }
    }
}
