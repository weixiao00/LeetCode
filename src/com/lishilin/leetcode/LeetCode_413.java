package com.lishilin.leetcode;

/**
 * 等差数列划分
 */
public class LeetCode_413 {

    //动态规划
    public int numberOfArithmeticSlices(int[] A) {
        int res = 0;
        if (A.length < 3)
            return 0;
        int[] dp = new int[A.length];
        for (int i=2;i<A.length;i++) {
            if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
                dp[i] = dp[i-1] + 1;
                res += dp[i];
            }
        }
        return res;
    }

    //暴力
    public int numberOfArithmeticSlinces(int[] A) {
        int res = 0;
        for (int i=0;i<A.length-2;i++) {
            int d = A[i+1] - A[i];
            for (int j=i+2;j<A.length;j++) {
                if (A[j] - A[j-1] == d) {
                    res ++;
                } else {
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode_413 leetCode_413 = new LeetCode_413();
        //[1, 2, 3, 4]
        int[] A = new int[]{1, 2, 3, 4};
        System.out.println(leetCode_413.numberOfArithmeticSlinces(A));
    }
}
