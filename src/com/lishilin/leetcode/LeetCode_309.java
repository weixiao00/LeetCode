package com.lishilin.leetcode;

public class LeetCode_309 {

    public int maxProfit(int[] prices) {
        if (prices.length == 1 || prices.length == 0) {
            return 0;
        }
        int res = 0;
        int[][] dp = new int[prices.length][prices.length];
        dp[0][1] = -prices[0];
        dp[0][0] = 0;
        dp[1][1] = Math.max(dp[0][1],dp[0][0] - prices[1]);
        dp[1][0] = Math.max(dp[0][0],dp[0][1] + prices[1]);
        for (int i=2;i<prices.length;i++) {
            dp[i][1] = Math.max(dp[i-2][0] - prices[i],dp[i-1][1]);
            dp[i][0] = Math.max(dp[i-1][1] + prices[i],dp[i-1][0]);
        }
        res = dp[prices.length-1][0];
        return res;
    }


    public int maxProfit_1(int[] prices) {
        int res = 0;
        int dp_i_1 = Integer.MIN_VALUE;
        int dp_i_0 = 0;
        int dp_prev_0 = 0;
        for (int i=0;i<prices.length;i++) {
            int tmp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0,dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1,dp_prev_0 - prices[i]);
            dp_prev_0 = tmp;
        }
        res = dp_i_0;
        return res;
    }
    public static void main(String[] args) {
        LeetCode_309 leetCode_309 = new LeetCode_309();
        //[1,2,3,0,2]
        int[] a = new int[]{1,2,3,0,2};
        System.out.println(leetCode_309.maxProfit_1(a));
    }
}
