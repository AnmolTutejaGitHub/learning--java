class Solution {
    public int scoreOfString(String s) {
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length())
                diff += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return diff;
    }
}
