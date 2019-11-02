package com.lishilin.leetcode;

public class LeetCode_70 {

    public int climbStairs(int n) {
        int res = 0;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        for (int i=2;i<n;i++) {
            a[i] = a[i-1] + a[i-2];
        }
        res = a[n-1];
        return res;
    }

    public static void main(String[] args) {
        LeetCode_70 leetCode_70 = new LeetCode_70();
        System.out.println(leetCode_70.climbStairs(3));
    }
}
