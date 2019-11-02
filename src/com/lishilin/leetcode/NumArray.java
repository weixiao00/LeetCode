package com.lishilin.leetcode;

public class NumArray {

    private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int res = 0;
        for (int m=i;m<=j;m++) {
            res += nums[m];
        }
        return res;
    }

    public static void main(String[] args) {
        //[-2, 0, 3, -5, 2, -1]
        int[] a = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(a);
        System.out.println(numArray.sumRange(0, 2));
    }
}
