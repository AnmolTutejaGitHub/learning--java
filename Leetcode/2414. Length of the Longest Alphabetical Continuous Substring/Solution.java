//package Leetcode.2414. Length of the Longest Alphabetical Continuous Substring;

class Solution {
    public int longestContinuousSubstring(String s) {
        int maxLen = 1;
        int currLen = 1;

        for (int e = 1; e < s.length(); e++) {
            if (s.charAt(e) - s.charAt(e - 1) == 1) {
                currLen++;
            } else
                currLen = 1;

            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}

// class Solution {
// public int longestContinuousSubstring(String s) {
// int start = 0;
// int maxLen = 1;
// boolean pass = false;

// for(int e=1;e<s.length();e++){
// pass = false;
// while(e<s.length() && s.charAt(e)-s.charAt(e-1)==1) {
// e++;
// pass = true;
// }
// if(pass) e--;
// if(s.charAt(e)-s.charAt(e-1)==1) maxLen = Math.max(maxLen,e-start+1);
// start = e;
// }
// return maxLen;
// }
// }
