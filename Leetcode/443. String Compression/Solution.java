//package Leetcode.443. String Compression;
class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int i = 0;
        while (i < n) {
            char curr_char = chars[i];
            int count = 0;
            while (i < n && curr_char == chars[i]) {
                count++;
                i++;
            }

            chars[index] = curr_char;
            index++;

            if (count > 1) {
                String count_str = "" + count;
                for (char ch : count_str.toCharArray()) {
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
    }
}
