//package Leetcode.2698. Find the Punishment Number of an Integer;

class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (check(String.valueOf(i * i), 0, i))
                sum += i * i;
        }
        return sum;
    }

    public boolean check(String str, int index, int target) {
        if (index == str.length())
            return target == 0;

        int sum = 0;
        for (int i = index; i < str.length(); i++) {
            sum = (str.charAt(i) - '0') + sum * 10;
            if (sum > target)
                break;
            if (check(str, i + 1, target - sum))
                return true;
        }
        return false;
    }
}