//package Leetcode.28. Find the Index of the First Occurrence in a String;

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle))
            return haystack.indexOf(needle);

        return -1;
    }
}
