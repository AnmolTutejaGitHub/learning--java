//package Leetcode.1844. Replace All Digits with Characters;

class Solution {
    public String replaceDigits(String s) {

        StringBuilder ans = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '3'
                    && s.charAt(i) != '4' && s.charAt(i) != '5' && s.charAt(i) != '6' && s.charAt(i) != '7'
                    && s.charAt(i) != '8' && s.charAt(i) != '9') {
                ans.append(s.charAt(i));
            } else {
                char ch = (char) (s.charAt(i - 1) + Integer.parseInt("" + s.charAt(i)));
                ans.append(ch);
            }

        }
        return ans.toString();
    }
}