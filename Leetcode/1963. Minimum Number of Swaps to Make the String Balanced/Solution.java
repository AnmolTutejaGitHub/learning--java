//package Leetcode.1963. Minimum Number of Swaps to Make the String Balanced;

class Solution {
    public int minSwaps(String s) {
        int map[] = new int[s.length()];
        int idx = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '[')
                map[idx++] = 0;
            else
                map[idx++] = 1;
        }

        int open = 0;
        int close = 0;
        int swaps = 0;
        int n = map.length / 2;
        int endOpen = map.length - 1;
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 0)
                open++;
            else
                close++;

            while (endOpen >= n && map[endOpen] != 0) {
                endOpen--;
            }

            if (close > open) {
                swap(map, i, endOpen);
                swaps++;
                close--;
                open++;
            }
        }
        return swaps;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
