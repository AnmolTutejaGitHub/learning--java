//package Leetcode.131. Palindrome Partitioning;

import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(0, new ArrayList(), s, res);
        return res;
    }

    public void backtrack(int index, ArrayList<String> curr, String s, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList(curr));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (isPalindrome(s.substring(index, i + 1))) {
                curr.add(s.substring(index, i + 1));
                backtrack(i + 1, curr, s, res);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
