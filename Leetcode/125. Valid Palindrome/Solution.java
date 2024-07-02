//package Leetcode.125. Valid Palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                sb.append(s.charAt(i));
        }

        return isPalindrome(sb);
    }

    public boolean isPalindrome(StringBuilder sb) {
        int s = 0;
        int e = sb.length() - 1;
        while (s <= e) {
            if (sb.charAt(s) != sb.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
}
