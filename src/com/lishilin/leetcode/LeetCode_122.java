package com.lishilin.leetcode;

public class LeetCode_122 {

    public int maxProfit(int[] prices) {
        int res = 0;
        int dp_i_0 = 0;
        int dp_i_1 = Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++) {
            int tmp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0,dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1,dp_i_0 - prices[i]);
        }
        res = dp_i_0;
        return res;
    }

    public static void main(String[] args) {
        LeetCode_122 leetCode_122 = new LeetCode_122();
        //[7,1,5,3,6,4]
        int[] a = new int[]{7,1,5,3,6,4};
        System.out.println(leetCode_122.maxProfit(a));
    }
}
