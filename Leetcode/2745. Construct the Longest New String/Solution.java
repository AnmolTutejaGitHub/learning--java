//package Leetcode.2745. Construct the Longest New String;

class Solution {
    public int longestString(int x, int y, int z) {
        if(x==y)  return 2*(Math.min(x,y) + Math.min(x,y) + z);
        return 2*(Math.min(x,y) + Math.min(x,y) + 1 + z);
    }
}
