import java.util.HashSet;

class Solution {
    public int partitionString(String s) {
        int start = 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for (int e = 0; e < s.length(); e++) {
            if (!set.contains(s.charAt(e))) {
                set.add(s.charAt(e));
                continue;
            }
            count++;
            for (int i = start; i < e; i++) {
                set.remove(s.charAt(i));
            }
            set.add(s.charAt(e));
            start = e;
        }

        return count + 1;
    }
}