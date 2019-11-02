package com.lishilin.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean res = false;
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i=1;i<=s.length();i++) {
            for (int j=0;j<i;j++) {
                if (dp[j] == true && set.contains(s.substring(j,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        res = dp[s.length()];
        return res;
    }

    public static void main(String[] args) {
        //s = "leetcode", wordDict = ["leet", "code"]
        LeetCode_139 leetCode_139 = new LeetCode_139();
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(leetCode_139.wordBreak(s, wordDict));
    }
}
