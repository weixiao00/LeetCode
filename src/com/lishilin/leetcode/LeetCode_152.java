package com.lishilin.leetcode;

/**
 * 最大连续子数组的乘机
 */
public class LeetCode_152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curMax = 1;
        int curMin = 1;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] < 0) {
                int tmp = curMax;
                curMax = curMin;
                curMin = tmp;
            }
            curMax = Math.max(curMax*nums[i],nums[i]);
            curMin = Math.min(curMin*nums[i],nums[i]);
            max = Math.max(curMax,max);
        }
        return max;
    }
}
