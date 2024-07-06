//package Leetcode.984. String Without AAA or BBB;

class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int max = Math.max(a, b);
        char maxchar = max == a ? 'a' : 'b';
        int min = max == a ? b : a;
        char minchar = maxchar == 'a' ? 'b' : 'a';

        while (max > 0 && min > 0) {
            if (max > min) {
                sb.append(maxchar);
                sb.append(maxchar);
                max -= 2;
            } else {
                sb.append(maxchar);
                max--;
            }

            sb.append(minchar);
            min--;
        }
        while (max > 0) {
            sb.append(maxchar);
            max--;
        }
        while (min > 0) {
            sb.append(minchar);
            min--;
        }

        return sb.toString();
    }
}
