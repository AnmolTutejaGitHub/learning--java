//package Leetcode.2483. Minimum Penalty for a Shop;

class Solution {
    public int bestClosingTime(String customers) {
        int sum = 0;
        for (char ch : customers.toCharArray()) {
            if (ch == 'Y')
                sum += 1;
        }

        int n = customers.length();
        int min[] = { Integer.MAX_VALUE, -1 };
        int prefix = 0;
        int currPen = 0;
        for (int i = 0; i <= customers.length(); i++) {
            if (i == n) {
                if (customers.charAt(n - 1) == 'Y' && min[0] > currPen) {
                    return n;
                }
                continue;
            }
            char curr = customers.charAt(i);
            if (currPen + (sum - prefix) < min[0]) {
                min[0] = currPen + (sum - prefix);
                min[1] = i;
            }
            if (curr == 'N')
                currPen += 1;
            else
                prefix += 1;
        }
        return min[1];
    }
}
