//package Leetcode.1716. Calculate Money in Leetcode Bank;

class Solution {
    public int totalMoney(int n) {
        int days = 0;
        int monday = 0;
        int money = 0;
        int sum = 0;
        int cycle = 0;

        for (int i = 1; i <= n; i++) {
            if (cycle != 0 && cycle % 7 == 0) {
                monday++;
                money = monday + 1;

                sum += money;
                cycle++;
                // System.out.println(money);

                continue;
            }

            money++;
            sum += money;
            cycle++;
            // System.out.println(money);
        }
        return sum;

    }
}
