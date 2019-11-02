package com.lishilin.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给出一个由无重复的正整数组成的集合，找出其中最大的整除子集，子集中任意一对 (Si，Sj) 都要满足：Si % Sj = 0 或 Sj % Si = 0。
 *
 * 如果有多个目标子集，返回其中任何一个均可。
 */
public class LeetCode_368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int[] dp = new int[nums.length+1];//存储第i个元素最大整除子集
        int[] dp2 = new int[nums.length+1];//存储第i个元素的前驱元素
        Arrays.fill(dp,1);
        Arrays.fill(dp2,-1);
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++) {
            for (int j=0;j<i;j++) {
                if (nums[i]%nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    dp2[i] = j;
                }
            }
        }
        int index = 0;
        for (int i=0;i<dp.length;i++) {
            if (dp[i] > dp[index]) {
                index = i;
            }
        }
        while (index != -1) {
            res.add(nums[index]);
            index = dp2[index];
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_368 leetCode_368 = new LeetCode_368();
        int[] a = new int[]{4,8,10,240};
        List<Integer> list = leetCode_368.largestDivisibleSubset(a);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
