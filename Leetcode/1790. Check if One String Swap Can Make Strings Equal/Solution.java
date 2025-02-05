//package Leetcode.1790. Check if One String Swap Can Make Strings Equal;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char s1char = '@';
        char s2char = '&';
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) {
                    s1char = s1.charAt(i);
                    s2char = s2.charAt(i);
                } else if (s1char != s2.charAt(i) || s2char != s1.charAt(i))
                    return false;
            }
        }
        return (count == 0 || count == 2);
    }
}
