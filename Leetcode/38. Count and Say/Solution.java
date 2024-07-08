
//package Leetcode.38. Count and Say;
import java.util.*;

class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";

        return compress(countAndSay(n - 1));
    }

    public String compress(String s) {
        if (s.isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1))
                count++;
            else {
                sb.append(count).append(s.charAt(i));
                count = 1;
            }
        }
        return sb.toString();
    }
}