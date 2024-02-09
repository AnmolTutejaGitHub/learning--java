//package Leetcode.3019. Number of Changing Keys;

class Solution {
    public int countKeyChanges(String s) {
        String str = s.toLowerCase();

        int count = 0;

        int i = 0;
        int j = 1;
        while (j < str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                j++;
            }

            else if (str.charAt(i) != str.charAt(j)) {
                count++;
                i = j;
                j++;

            }
        }

        return count;

    }
}
