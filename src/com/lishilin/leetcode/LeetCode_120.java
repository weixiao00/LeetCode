package com.lishilin.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int res = Integer.MIN_VALUE;
        for (int i=triangle.size()-2;i>=0;i--) {
            for (int j=triangle.get(i).size()-1;j>=0;j--) {
                int min = Math.min(triangle.get(i).get(j)+triangle.get(i+1).get(j),triangle.get(i).get(j)+triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,min);
            }
        }
        res = triangle.get(0).get(0);
        return res;
    }

    public static void main(String[] args) {
        LeetCode_120 leetCode_120 = new LeetCode_120();
        //     [2],
        //    [3,4],
        //   [6,5,7],
        //  [4,1,8,3]
        List<Integer> list = new ArrayList<>();
        list.add(2);
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(7);
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(1);
        list3.add(8);
        list3.add(3);
        List<List<Integer>> list4 = new ArrayList<>();
        list4.add(list);
        list4.add(list1);
        list4.add(list2);
        list4.add(list3);
        System.out.println(list4);
        System.out.println(leetCode_120.minimumTotal(list4));
    }
}
