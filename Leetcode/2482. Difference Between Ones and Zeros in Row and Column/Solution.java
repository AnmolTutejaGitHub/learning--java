class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int diff[][] = new int[grid.length][grid[0].length];
        int row[] = new int[grid.length];
        int col[] = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                } else {
                    row[i]--;
                    col[j]--;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                diff[i][j] = row[i] + col[j];
            }
        }

        return diff;
    }
}
