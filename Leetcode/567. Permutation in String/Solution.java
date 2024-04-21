//package Leetcode.567. Permutation in String;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int swSize = s1.length();
        int s = 0;
        int map[] = new int[26];
        for (char ch : s1.toCharArray())
            map[ch - 'a']--;

        for (int e = 0; e < s2.length(); e++) {
            char ch = s2.charAt(e);
            map[ch - 'a']++;
            if (e - s + 1 > swSize) {
                map[s2.charAt(s) - 'a']--;
                s++;
            }

            boolean allZero = true;
            for (int i = 0; i < 26; i++) {
                if (map[i] != 0) {
                    allZero = false;
                    break;
                }
            }

            if (allZero)
                return true;
        }

        return false;
    }
}

// intution :make a frq array, decrease the freq of ele in s1 , maintain a
// sliding window of size s1 over s2
// inc the freq of ele in sliding window ,,, as freq of ele in s1 is already dec
// so when freq in
// sliding window is zero that window contains permutation
