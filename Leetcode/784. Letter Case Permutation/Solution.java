//package Leetcode.784. Letter Case Permutation;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        helper(0, s, "", res);
        return res;
    }

    public void helper(int idx, String s, String ans, List<String> res) {
        if (idx == s.length()) {
            res.add(ans);
            return;
        }

        char curr = s.charAt(idx);
        if (Character.isLetter(curr)) {
            helper(idx + 1, s, ans + Character.toUpperCase(curr), res);
            helper(idx + 1, s, ans + Character.toLowerCase(curr), res);
        } else
            helper(idx + 1, s, ans + curr, res);
    }
}
