package com.lishilin.leetcode;

public class LeetCode_121 {

    public int maxProfit(int[] prices) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        res = max;
        return res;
    }

    public static void main(String[] args) {
        LeetCode_121 leetCode_121 = new LeetCode_121();
        int[] a = new int[]{7,1,5,3,6,4};
        System.out.println(leetCode_121.maxProfit(a));
    }
}
