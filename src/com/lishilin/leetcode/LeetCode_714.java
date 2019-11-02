package com.lishilin.leetcode;

public class LeetCode_714 {

    public int maxProfit(int[] prices, int fee) {
        int res = 0;
        int dp_i_0 = 0;
        int dp_i_1 = Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++) {
            int tmp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0,dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1,dp_i_0 - prices[i] - fee);
        }
        res = dp_i_0;
        return res;
    }

    public static void main(String[] args) {
        LeetCode_714 leetCode_714 = new LeetCode_714();
        //[1, 3, 2, 8, 4, 9], fee = 2
        int[] a = new int[]{1, 3, 2, 8, 4, 9};
        System.out.println(leetCode_714.maxProfit(a, 2));
    }
}
