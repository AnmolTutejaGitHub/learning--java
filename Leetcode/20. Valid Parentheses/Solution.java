//package Leetcode.20. Valid Parentheses;

class Solution {
    public boolean isValid(String s) {
        boolean pass = true;
        while (pass && s.length() != 0) {
            pass = false;
            if (s.contains("()")) {
                s = s.replace("()", "");
                pass = true;
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
                pass = true;
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
                pass = true;
            }
            if (!pass)
                break;
        }
        return s.length() == 0;
    }
}
