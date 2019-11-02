package com.lishilin.leetcode;

public class LeetCode_209 {

    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
            while (sum >= s) {
                res = Math.min(res,right-left+1);
                sum -= nums[left];
                left ++;
            }
            right ++;
        }
        if (Integer.MAX_VALUE == res) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_209 leetCode_209 = new LeetCode_209();
        //s = 7, nums = [2,3,1,2,4,3]
        int[] a = new int[]{2,3,1,2,4,3};
        System.out.println(leetCode_209.minSubArrayLen(7, a));
    }
}
