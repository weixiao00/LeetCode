package com.lishilin.leetcode;

public class Number {

    public boolean number(int[] nums,int num) {
        boolean res = false;
        int left = 0;
        int right = 0;
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
            while (sum > num) {
                sum -= nums[left++];
            }
            if (sum == num) {
                return true;
            }
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        Number number = new Number();
        int[] a = new int[]{2,3,4,5,-3};
        System.out.println(number.number(a, 6));
    }
}
