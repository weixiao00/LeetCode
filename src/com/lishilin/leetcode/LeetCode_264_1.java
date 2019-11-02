package com.lishilin.leetcode;


/**
 * 三指针
 */
public class LeetCode_264_1 {

    public int nthUglyNumber(int n) {
        int res = 0;
        int dp[] = new int[n];//dp[i]表示第i个抽数
        dp[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        for (int i=1;i<n;i++) {
            int min = Math.min(Math.min(dp[i2] * 2,dp[i3] * 3),dp[i5] * 5);
            if (min == dp[i2] * 2) i2 ++;
            if (min == dp[i3] * 3) i3 ++;
            if (min == dp[i5] * 5) i5 ++;
            dp[i] = min;
        }
        res = dp[n-1];
        return res;
    }
}
