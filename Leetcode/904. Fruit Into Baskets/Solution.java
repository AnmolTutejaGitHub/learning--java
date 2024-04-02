import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if (n <= 2)
            return n;
        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int maxLen = 0;
        for (int end = 0; end < n; end++) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);

            if (map.size() > 2) {
                while (map.size() != 2) {
                    map.put(fruits[start], map.get(fruits[start]) - 1);
                    if (map.get(fruits[start]) == 0)
                        map.remove(fruits[start]);
                    start++;
                }
            }

            if (map.size() <= 2) {
                maxLen = Math.max(maxLen, end - start + 1);
            }

        }
        return maxLen;
    }
}