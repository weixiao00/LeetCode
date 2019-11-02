package com.lishilin.leetcode;

import java.util.Arrays;

public class LeetCode_300 {

    public int lengthOfLIS(int[] nums) {
        int res = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i=0;i<nums.length;i++) {
            for (int j=0;j<i;j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
            }
            if (dp[i] > res)
                res = dp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_300 leetCode_300 = new LeetCode_300();
        //[10,9,2,5,3,7,101,18]
        int[] a = new int[]{10,9,2,5,3,7,101,18};
        System.out.println(leetCode_300.lengthOfLIS(a));
    }
}
