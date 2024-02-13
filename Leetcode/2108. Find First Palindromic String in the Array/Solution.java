//package Leetcode.2108. Find First Palindromic String in the Array;

class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i]))
                return words[i];
        }
        return "";

    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
