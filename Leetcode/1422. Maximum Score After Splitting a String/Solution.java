class Solution {
    public int maxScore(String s) {
        int count_1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == 1)
                count_1++;
        }

        int count_0 = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == 0)
                count_0++;
            else
                count_1--;

            if (i != s.length() - 1)
                sum = Math.max(sum, count_0 + count_1);
        }
        return sum;
    }
}