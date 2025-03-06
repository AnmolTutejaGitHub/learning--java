import java.util.HashMap;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        int n = grid.length;
        int res[] = new int[2];
        for (int i = 1; i <= n * n; i++) {
            int curr = map.getOrDefault(i, 0);
            if (curr == 0)
                res[1] = i;
            else if (curr == 2)
                res[0] = i;
        }
        return res;
    }
}