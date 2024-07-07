//package Leetcode.3210. Find the Encrypted String;

class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append(s.charAt((i + k) % s.length()));
        }
        return res.toString();
    }
}