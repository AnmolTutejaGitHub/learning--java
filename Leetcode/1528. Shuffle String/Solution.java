//package Leetcode.1528. Shuffle String;

class Solution {
    public String restoreString(String s, int[] indices) {
        // String ans="";

        // for(int i=0;i<indices.length;i++) ans+=""+s.charAt(indices[i]);
        // return ans ;

        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++)
            ans[indices[i]] = s.charAt(i);
        // return String.join(ans,"");
        return String.valueOf(ans); // valueOf method to convert char array to String
    }
}