//package Leetcode.22. Generate Parentheses;

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        backtrack(0, n, 0, 0, "", res);
        return res;
    }

    public void backtrack(int index, int n, int open, int close, String curr, ArrayList<String> res) {
        if (index == 2 * n) {
            res.add(curr);
            return;
        }

        if (open < n)
            backtrack(index + 1, n, open + 1, close, curr + "(", res);

        if (close < open)
            backtrack(index + 1, n, open, close + 1, curr + ")", res);
    }
}