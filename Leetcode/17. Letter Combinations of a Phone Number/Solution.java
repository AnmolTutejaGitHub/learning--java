//package Leetcode.17. Letter Combinations of a Phone Number;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        String map[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> res = new ArrayList<>();

        if (digits.equals(""))
            return res;

        String ans = "";

        helper(0, ans, digits, map, res);
        return res;
    }

    void helper(int idx, String ans, String digits, String[] map, List<String> res) {
        if (idx == digits.length()) {
            res.add(ans);
            return;
        }

        int number = digits.charAt(idx) - '0';
        String mapped = map[number];

        for (int i = 0; i < mapped.length(); i++) {
            helper(idx + 1, ans + mapped.charAt(i), digits, map, res);
        }
    }
}
