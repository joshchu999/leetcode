package idv.joshchu999.exercise.leetcode.alg62;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    private int recursive(int m, int n, int fromM, int fromN, int[][] grid) {

        if (grid[fromM][fromN] == -1) {
            grid[fromM][fromN] = recursive(m, n, fromM + 1, fromN, grid) + recursive(m, n, fromM, fromN + 1, grid);
        }

        return grid[fromM][fromN];
    }

    public int uniquePaths(int m, int n) {

        int result = 0;

        int[][] grid = new int[m + 1][n + 1];

        for (int i = 1 ; i <= m ; i++) {
            for (int j = 1 ; j <= n ; j++) {
                if ((i == m) || (j == n)) {
                    grid[i][j] = 1;
                }
                else {
                    grid[i][j] = -1;
                }
            }
        }

        return recursive(m, n, 1, 1, grid);
    }
}
