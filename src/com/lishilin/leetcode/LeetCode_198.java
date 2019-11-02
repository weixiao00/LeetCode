package com.lishilin.leetcode;

public class LeetCode_198 {

    public int rob(int[] nums) {
        int res = 0;
        int curMax = 0;
        int preMax = 0;
        for (int i=0;i<nums.length;i++) {
            int tmp = curMax;
            curMax = Math.max(preMax + nums[i],curMax);
            preMax = tmp;
        }
        res = curMax;
        return res;
    }

    public static void main(String[] args) {
        LeetCode_198 leetCode_198 = new LeetCode_198();
        //[2,7,9,3,1]
        int[] a = new int[]{2,7,9,3,1};
        System.out.println(leetCode_198.rob(a));
    }
}
