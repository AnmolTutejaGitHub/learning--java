//package Leetcode.5. Longest Palindromic Substring;

class Solution {
    public String longestPalindrome(String s) {

        if (s.length() == 1)
            return s;
        char[] str = s.toCharArray();
        int len = 0;
        String ans = "";
        int i = 0;
        while (i < str.length) {
            for (int end = i + 1; end < str.length; end++) {
                if (str[i] == str[end]) {
                    if (isPalindrome(str, i, end)) {
                        if (end + 1 - i > len) {
                            len = end + 1 - i;
                            ans = new String(str).substring(i, end + 1);

                        }
                    }

                }
            }
            i++;
        }

        if (ans.equals(""))
            return "" + s.charAt(0);
        return ans;

    }

    public static boolean isPalindrome(char[] str, int start, int end) {
        while (start <= end) {
            if (str[start] != str[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
