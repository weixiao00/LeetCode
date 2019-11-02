package com.lishilin.leetcode;

public class LeetCode_64 {

    public int minPathSum(int[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i=1;i<m;i++) {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for (int i=1;i<n;i++) {
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }
        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                dp[i][j] = grid[i][j] + dp[i][j-1] < grid[i][j] + dp[i-1][j] ? grid[i][j] + dp[i][j-1] : grid[i][j] + dp[i-1][j];
            }
        }
        res = dp[m-1][n-1];
        return res;
    }

    public static void main(String[] args) {
        LeetCode_64 leetCode_64 = new LeetCode_64();
        //[1,3,1],
        //  [1,5,1],
        //  [4,2,1]
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(leetCode_64.minPathSum(grid));
    }
}
