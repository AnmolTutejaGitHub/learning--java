//package Leetcode.2000. Reverse Prefix of Word;

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return word;
        System.out.println(index);

        for (int i = index; i >= 0; i--) {
            ans.append(word.charAt(i));
        }
        ans.append(word.substring(index + 1));

        return ans.toString();

    }
}
