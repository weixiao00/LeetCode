package com.lishilin.leetcode;

/**
 * 求数字转字母的方式
 */
public class LeetCode_91 {

    public int numDecodings(String s) {
        int n = s.length();
        int res = 0;
        if (s == null) {
            return 0;
        }
        int[] dp = new int[n+1];
        dp[n] = 1;
        dp[n-1] = s.charAt(n-1) == '0' ? 0 : 1;
        for (int i=n-2;i>=0;i--) {
            if (s.charAt(i) == '0')
                continue;
            dp[i] = Integer.parseInt(s.substring(i,i+2)) <= 26 ? dp[i+1] + dp[i+2] : dp[i+1];
        }
        res = dp[0];
        return res;
    }

    public static void main(String[] args) {
        LeetCode_91 leetCode_91 = new LeetCode_91();
        System.out.println(leetCode_91.numDecodings("226"));
    }
}
