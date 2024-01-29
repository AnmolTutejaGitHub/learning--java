//package Leetcode.1323. Maximum 69 Number;

class Solution {
    public int maximum69Number(int num) {
        String nums = "" + num;
        StringBuilder n = new StringBuilder("" + num);
        for (int i = 0; i < nums.length(); i++) {
            if (n.charAt(i) == '6') {
                n.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(n.toString());
    }
}
