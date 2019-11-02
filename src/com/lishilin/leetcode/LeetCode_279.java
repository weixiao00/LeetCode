package com.lishilin.leetcode;

public class LeetCode_279 {

    public int numSquares(int n) {
        if (n == 1) {
            return 1;
        }
        int res = 0;
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<=n;i++) {
            int min = i;
            if (sqrt(i)) {
                min = 1;
            } else {
                for (int j=1;j<=i/2;j++) {
                    int cur = dp[j] + dp[i-j];
                    if (cur < min) {
                        min = cur;
                    }
                }
            }
            dp[i] = min;
        }
        res = dp[n];
        return res;
    }
    private boolean sqrt(int num) {
        boolean res = false;
        for (int i=1;i<num;i++) {
            if (num == i*i) {
                res = true;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_279 leetCode_279 = new LeetCode_279();
        System.out.println(leetCode_279.numSquares(3));
    }
}
