class Solution {
    public int firstUniqChar(String s) {
        int[] track = new int[26];
        for (int i = 0; i < s.length(); i++) {
            track[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (track[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}