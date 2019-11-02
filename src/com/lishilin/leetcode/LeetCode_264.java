package com.lishilin.leetcode;

public class LeetCode_264 {

    public int nthUglyNumber(int n) {
        int res = 0;
        int index = 0;
        int number = 0;
        while (index < n) {
            number ++;
            if (isUgly(number)) {
                index ++;
            }
        }
        res = number;
        return res;
    }
    //分开写判断
    private boolean isUgly(int num) {
        while (num%2 == 0) {
            num /= 2;
        }
        while (num%3 == 0) {
            num /= 3;
        }
        while (num%5 == 0) {
            num /= 5;
        }
        return num == 1 ? true : false;
    }
    public static void main(String[] args) {
        LeetCode_264 leetCode_264 = new LeetCode_264();
        System.out.println(leetCode_264.nthUglyNumber(1352));
    }
}
