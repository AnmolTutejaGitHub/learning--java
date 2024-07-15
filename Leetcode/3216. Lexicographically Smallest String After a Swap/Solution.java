//package Leetcode.3216. Lexicographically Smallest String After a Swap;

class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (arr[i] > arr[i + 1] && sameParity(arr[i], arr[i + 1])) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                break;
            }
        }
        return new String(arr);
    }

    public boolean sameParity(int a, int b) {
        return (a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0);
    }
}
