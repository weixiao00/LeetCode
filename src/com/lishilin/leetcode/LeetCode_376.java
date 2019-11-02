package com.lishilin.leetcode;


/**
 * 摆动序列
 */
public class LeetCode_376 {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int res = 0;
        int[] up = new int[nums.length];
        int[] down = new int[nums.length];
        for (int i=1;i<nums.length;i++) {
            for (int j=0;j<i;j++) {
                if (nums[i] > nums[j]) {
                    up[i] = Math.max(up[i],down[j] + 1);
                } else if(nums[i] < nums[j]) {
                    down[i] = Math.max(down[i],up[j] + 1);
                }
            }
        }
        res = 1 + Math.max(up[nums.length-1],down[nums.length-1]);
        return res;
    }

    public static void main(String[] args) {
        LeetCode_376 leetCode_376 = new LeetCode_376();
        //[1,7,4,9,2,5]
        int[] a = new int[]{1,7,4,9,2,5};
        System.out.println(leetCode_376.wiggleMaxLength(a));
    }
}
