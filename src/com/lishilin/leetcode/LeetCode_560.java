package com.lishilin.leetcode;

public class LeetCode_560 {

    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum = 0;
            for (int j=i;j<nums.length;j++) {
                sum += nums[j];
                if (sum == k) {
                    res ++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_560 leetCode_560 = new LeetCode_560();
        //nums = [1,1,1], k = 2
        int[] a = new int[]{1,1,1};
        System.out.println(leetCode_560.subarraySum(a, 2));
    }
}
