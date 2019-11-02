package com.lishilin.leetcode;

/**
 * m，n个格子，只能向下走和向右走，有多少种走法，其实就是排列组合问题中的组合问题
 */
public class LeetCode_62 {

    public int uniquePaths(int m, int n) {
        int res = 0;
        int[][] tips = new int[m][n];
        for (int i=0;i<m;i++) {
            tips[i][0] = 1;
        }
        for (int j=0;j<n;j++) {
            tips[0][j] = 1;
        }
        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                tips[i][j] = tips[i-1][j] + tips[i][j-1];
            }
        }
        res = tips[m-1][n-1];
        return res;
    }

    public static void main(String[] args) {
        LeetCode_62 leetCode62 = new LeetCode_62();
        System.out.println(leetCode62.uniquePaths(3,3));
    }
}
