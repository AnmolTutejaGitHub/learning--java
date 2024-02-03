//package Leetcode.2710. Remove Trailing Zeros From a String;

class Solution {
    public String removeTrailingZeros(String num) {

        StringBuilder rev = (new StringBuilder(num)).reverse();

        StringBuilder ans = new StringBuilder();
        boolean trailing = true;

        for (int i = 0; i < num.length(); i++) {
            if (rev.charAt(i) != '0')
                trailing = false;
            if (!trailing)
                ans.append(rev.charAt(i));
        }
        return ans.reverse().toString();

    }
}
