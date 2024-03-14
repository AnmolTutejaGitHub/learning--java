//package Leetcode.796. Rotate String;

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        s += s;
        return s.contains(goal);
    }
}
