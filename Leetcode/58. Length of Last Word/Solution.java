//package Leetcode.58. Length of Last Word;

// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] str = s.split("\\s+");

//         return str[str.length - 1].length();

//     }
// }

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                length++;
            else if (s.charAt(i) == ' ' && length != 0)
                break;
        }
        return length;
    }
}
