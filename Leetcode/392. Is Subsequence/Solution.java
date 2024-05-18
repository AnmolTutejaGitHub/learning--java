class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptr = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            while (ptr < t.length() && t.charAt(ptr) != s.charAt(i))
                ptr++;
            if (ptr < t.length())
                count++;
            // System.out.println(count);
            ptr++;
            if (ptr == t.length())
                break;
        }

        return count == s.length();
    }
}