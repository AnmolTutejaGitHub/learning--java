//package Leetcode.1750. Minimum Length of String After Deleting Similar Ends;

class Solution {
    public int minimumLength(String s) {
        int len = s.length();

        if (len == 1)
            return 1;

        int i = 0;
        int j = s.length() - 1;
        if (s.charAt(i) != s.charAt(j))
            return s.length();

        while (i < j) {
            System.out.println(i);
            System.out.println(j);
            if (s.charAt(i) != s.charAt(j))
                break;

            while (i + 1 < s.length() && i < j && s.charAt(i) == s.charAt(i + 1)) {
                i++;

            }
            while (j - 1 >= 0 && i < j && s.charAt(j) == s.charAt(j - 1)) {
                j--;

            }
            if (i < j && s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }

        }

        System.out.println(i);
        System.out.println(j);
        // blooean crossed;
        if (i == j && s.charAt(i) == s.charAt(i - 1))
            return 0;

        return j - i + 1;

    }
}