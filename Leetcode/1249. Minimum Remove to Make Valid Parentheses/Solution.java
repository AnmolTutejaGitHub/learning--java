//package Leetcode.1249. Minimum Remove to Make Valid Parentheses;

class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder res = new StringBuilder();
        int closeCount = 0;
        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                openCount++;
                res.append('(');
            }

            if (ch == ')')
                closeCount++;

            if (ch == ')' && closeCount > openCount)
                closeCount--;
            else if (ch == ')' && closeCount <= openCount)
                res.append(')');

            if (ch >= 97 && ch <= 122)
                res.append(ch);
        }

        int idx = res.length() - 1;
        while (idx >= 0 && openCount > closeCount) {
            if (res.charAt(idx) == '(') {
                openCount--;
                res.deleteCharAt(idx);
            }
            idx--;
        }

        return res.toString();
    }
}

// intution : iterate through string .. problem was i am able to delete ')' by
// keeping track of '('
// getting problem how to delete '(' if it exceed the number of ')'
// get another pass from end and delete ')' while count of '(' is > ')'
