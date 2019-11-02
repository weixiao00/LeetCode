package com.lishilin.leetcode;

/**
 * 判断子序列
 */
public class LeetCode_392 {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        if (t.length() == 0)
            return false;
        boolean res = false;
        int index = 0;
        for (int i=0;i<t.length();i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index ++;
            }
            if (index == s.length()) {
                res = true;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_392 leetCode_392 = new LeetCode_392();
        //"abc", t = "ahbgdc"
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(leetCode_392.isSubsequence(s, t));
    }
}
