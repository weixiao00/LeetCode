package com.lishilin.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个字符串，进行z字型转换
 */
public class LeetCode_6 {

    public static String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        List<StringBuilder> list = new ArrayList<>();
        for (int i=0;i<Math.min(s.length(),numRows);i++) {
            list.add(new StringBuilder());
        }
        int num = 0;
        boolean flag = false;
        for (int i=0;i<s.length();i++) {
            list.get(num).append(s.charAt(i));
            if (num == 0 || num == list.size() - 1) {
                flag = !flag;
            }
            num = flag ? ++num : --num;
        }
        list.forEach(a -> res.append(a));
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("LEETCODEISHIRING",4));
        //LCIRETOESIIGEDHN   3
        //LDREOEIIECIHNTSG   4
    }
}
