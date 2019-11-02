package com.lishilin.leetcode;

public class LeetCode_96 {

    public int numTrees(int n) {
        int res = 0;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        res = dp[n];
        return res;
    }

    public static void main(String[] args) {
        LeetCode_96 leetCode_96 = new LeetCode_96();
        System.out.println(leetCode_96.numTrees(3));
    }
}
