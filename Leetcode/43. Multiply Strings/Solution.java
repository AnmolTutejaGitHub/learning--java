//package Leetcode.43. Multiply Strings;

class Solution {
    public String multiply(String num1, String num2) {
        int arr[] = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int prod = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = arr[i + j + 1] + prod;
                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int i = 0; i < arr.length; i++) {
            while (i < arr.length && leadingZero && arr[i] == 0)
                i++;
            leadingZero = false;
            if (i < arr.length)
                sb.append(arr[i]);
        }
        if (sb.length() == 0)
            return "0";
        return sb.toString();
    }
}