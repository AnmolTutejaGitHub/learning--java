//package Leetcode.860. Lemonade Change;
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count[] = new int[2];

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                count[0]++;

            else if (bills[i] == 10) {
                count[1]++;
                count[0]--;
                if (count[0] < 0)
                    return false;
            }

            else if (bills[i] == 20) {
                if (count[1] >= 1 && count[0] >= 1) {
                    count[0]--;
                    count[1]--;
                }

                else if (count[1] == 0 && count[0] >= 3) {
                    count[0] -= 3;
                }

                else
                    return false;

            }

        }
        return true;
    }
}
