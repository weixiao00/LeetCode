package com.lishilin.leetcode;

public class LeetCode_221 {

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int res = 0;
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int maxLength = 0;
        for (int i=1;i<dp.length;i++) {
            for (int j=1;j<dp[0].length;j++) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1]) + 1;
                    maxLength = Math.max(dp[i][j],maxLength);
                }
            }
        }
        res = maxLength;
        return res*res;
    }
}
