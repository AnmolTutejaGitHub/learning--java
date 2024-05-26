// package Leetcode.1160. Find Words That Can Be Formed by Characters;

class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for (String word : words) {
            if (searching(word, chars))
                count += word.length();
        }
        return count;
    }

    public boolean searching(String words, String chars) {
        int map[] = new int[26];
        for (char c : words.toCharArray())
            map[c - 'a']++;

        for (int i = 0; i < chars.length(); i++) {
            // if(map[chars.charAt(i) - 'a']!=0)
            map[chars.charAt(i) - 'a']--;
        }

        for (int freq : map)
            if (freq > 0)
                return false;

        return true;
    }
}
