//package Leetcode.476. Number Complement;

class Solution {
    public int findComplement(int num) {

        if (num == 0)
            return 1;

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % 2;
            sb.append(rem);
            num /= 2;
        }

        return flip(sb.toString());
    }

    public int flip(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0')
                sb.append('1');
            else
                sb.append('0');
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
