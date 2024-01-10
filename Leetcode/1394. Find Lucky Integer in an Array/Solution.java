//package Leetcode.1394. Find Lucky Integer in an Array;

class Solution {
    public int findLucky(int[] arr) {
        int[] frequency = new int[arr.length];
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            int f = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    f++;
            }
            frequency[i] = f;

            if (arr[i] == frequency[i] && arr[i] > max)
                max = arr[i];
        }
        return max;

    }
}
