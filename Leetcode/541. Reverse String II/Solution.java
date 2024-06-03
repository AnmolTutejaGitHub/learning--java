//package Leetcode.541. Reverse String II;

class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        if (s.length() <= k)
            return reverse(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i += 2 * k) {
            if (i + k - 1 >= arr.length)
                reverse(arr, i, arr.length - 1);
            else
                reverse(arr, i, i + k - 1);
        }
        return new String(arr);
    }

    public String reverse(char[] s, int l, int r) {

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        return new String(s);
    }
}
