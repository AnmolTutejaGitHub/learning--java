//package Leetcode.3039. Apply Operations to Make String Empty;

class Solution {
    public String lastNonEmptyString(String s) {
        StringBuilder sb = new StringBuilder();
        int map[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }

        // ArrayList<Integer> maxIdx = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 26; i++)
            max = Math.max(max, map[i]);
        for (int i = 0; i < 26; i++)
            if (map[i] != max)
                map[i] = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (map[s.charAt(i) - 'a'] != 0) {
                sb.append(s.charAt(i));
                map[s.charAt(i) - 'a'] = 0;
            }
        }

        return sb.reverse().toString();
    }
}
