//package Leetcode.2729. Check if The Number is Fascinating;

class Solution {
    public boolean isFascinating(int n) {

        int n2 = 2 * n;
        int n3 = 3 * n;

        String concat = "" + n + "" + n2 + "" + n3;
        long num = Long.parseLong(concat);

        boolean[] arr = new boolean[10]; // default false //arr[0] always false so setting to true
        int[] count = new int[10];
        arr[0] = true;
        count[0] = 1;
        for (int i = 0; i < concat.length(); i++) {
            int x = Integer.parseInt("" + concat.charAt(i));
            {
                arr[x] = true;
                count[x]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false || count[i] != 1)
                return false;
        }
        return true;

    }
}
