class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0;
        int currCost = 0;
        int Len = 0;

        for (int e = 0; e < s.length(); e++) {
            currCost += Math.abs(s.charAt(e) - t.charAt(e));

            while (currCost > maxCost && start <= e) {
                currCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            Len = Math.max(Len, e - start + 1);
        }
        return Len;
    }
}