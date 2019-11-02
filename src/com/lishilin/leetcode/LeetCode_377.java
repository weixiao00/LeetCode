package com.lishilin.leetcode;

/**
 * 组合总和
 */
public class LeetCode_377 {

    public int combinationSum4(int[] nums, int target) {
        int res = 0;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i=1;i<=target;i++) {
            for (int j=0;j<nums.length;j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i-nums[j]];
                }
            }
        }
        res = dp[target];
        return res;
    }

    public static void main(String[] args) {
        LeetCode_377 leetCode_377 = new LeetCode_377();
        //nums = [1, 2, 3]
        int[] a = new int[]{1,2,3};
        System.out.println(leetCode_377.combinationSum4(a, 4));
    }
}
