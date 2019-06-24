package com.leetcode.problems.longestsubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/**
 * 题目描述：
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        String[] t = s.split("");
        Set<String> ds = new HashSet<String>();//记录每一次循环的不重复最长子串
        boolean containBlank = false;//是否包含空格字符
        int curMax = 0;//当前回合的最大子串长度
        int beforeMax = 0;//已经跑过的回合中的最大子串长度
        for (int i=1; i< t.length;i++) {
            //每次记录下最长子串
            //判断当前字符在缓存的最长字串中是否存在
            if (ds.contains(t[i]) || (containBlank && Integer.valueOf(t[i].toCharArray()[0]) == 32)) {//说明
                if (ds.size() > beforeMax) {//说明出现了更长的不重复字串
                    curMax = ds.size();
                    beforeMax = curMax;
                }
                ds = new HashSet<String>();//重置
            }
            if (Integer.valueOf(t[i].toCharArray()[0]) == 32) containBlank = true;
            ds.add(t[i]);//作为下一回合的起始
            curMax = ds.size();
        }
        if (beforeMax > curMax) {//少了一次迭代的比较
            curMax = beforeMax;
        }
        return curMax;
    }


}
