package com.lishilin.leetcode;

public class RevertNum {

    public int revert(int num) {
        int tmp = 0;
        int res = 0;
        while (num != 0) {
            res = res * 10 + num%10;
            if (tmp != res/10) {
                return 0;
            }
            tmp = res;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        RevertNum revertNum = new RevertNum();
        System.out.println(revertNum.revert(12300));
    }
}
