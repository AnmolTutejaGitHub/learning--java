//package Leetcode.1945. Sum of Digits of String After Convert;

class Solution {
    public int getLucky(String s, int k) {
        // long num=0;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int curr = (s.charAt(i) - 'a') + 1;
            str.append(curr);
        }

        for (int i = 0; i < k; i++) {
            str = new StringBuilder(digitSum(str.toString()));
        }

        return Integer.parseInt(str.toString());
    }

    public String digitSum(String num) {
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0';
        }
        return String.valueOf(sum);
    }
}
