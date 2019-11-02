package com.lishilin.leetcode;

import java.util.Arrays;

public class LeetCode_213 {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int res = 0;
        res = Math.max(partion(Arrays.copyOfRange(nums,0,nums.length-1)),partion(Arrays.copyOfRange(nums,1,nums.length)));
        return res;
    }
    private int partion(int[] nums) {
        int res = 0;
        int curMax = 0;
        int prevMax = 0;
        for (int i=0;i<nums.length;i++) {
            int tmp = curMax;
            curMax = Math.max(tmp,prevMax+nums[i]);
            prevMax = tmp;
        }
        res = curMax;
        return res;
    }

    public static void main(String[] args) {
        LeetCode_213 leetCode_213 = new LeetCode_213();
        //[1,2,3,1]
        int[] a = new int[]{1,2,3,1};
        System.out.println(leetCode_213.partion(a));
    }
}
