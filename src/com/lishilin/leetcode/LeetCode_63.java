package com.lishilin.leetcode;

public class LeetCode_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        int res = 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] tips = new int[obstacleGrid.length][obstacleGrid[0].length];
        boolean flag = false;
        for (int i=0;i<m;i++) {
            if (i == 0) {
                tips[i][0] = 1;
            } else {
                tips[i][0] = tips[i-1][0];
            }
            if (obstacleGrid[i][0] == 1) {
                tips[i][0] = 0;
            }
        }
        for (int j=0;j<n;j++) {
           if (j == 0) {
               tips[0][j] = 1;
           } else {
               tips[0][j] = tips[0][j-1];
           }
           if (obstacleGrid[0][j] == 1) {
               tips[0][j] = 0;
           }
        }
        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                tips[i][j] = tips[i-1][j] + tips[i][j-1];
                if (obstacleGrid[i][j] == 1) {
                    tips[i][j] = 0;
                }
            }
        }
        res = tips[m-1][n-1];
        return res;
    }

    public static void main(String[] args) {
        LeetCode_63 leetCode_63 = new LeetCode_63();
        int[][] a = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(leetCode_63.uniquePathsWithObstacles(a));
    }
}
