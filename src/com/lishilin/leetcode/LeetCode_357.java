package com.lishilin.leetcode;

/**
 * 给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10n
 */
public class LeetCode_357 {

    public int countNumbersWithUniqueDigits(int n) {
        int res = 0;
        if (n == 0)
            return 1;
        if (n == 1)
            return 10;
        int[] dp = new int[n+1];//n表示有几位是数字
        dp[1] = 10;
        for (int i=2;i<=n;i++) {
            //排列组合问题
            int max = 9;
            for (int j=9;j>10-i;j--) {
                max = max * j;
            }
            dp[i] = dp[i-1] + max;
        }
        res = dp[n];
        return res;
    }

    public static void main(String[] args) {
        LeetCode_357 leetCode_357 = new LeetCode_357();
        System.out.println(leetCode_357.countNumbersWithUniqueDigits(2));
    }
}
