package com.leetcode.problems.longestsubstring;

import java.util.*;
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

    /**
     * 不重复字符的最长子串
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        //记录已存在的
        HashSet<Character> existed = new HashSet<>();
        char[] chars = s.toCharArray();//
        int max = 0;
        int curMax = 0;
        for (int i=0; i < chars.length; i++) {//每一个的起始字符位置
            existed.clear();//重新开启
            curMax = 0;
            for (int j=i; j < chars.length; j++) {//从起始字符往后遍历，如果出现
                if (existed.contains(chars[j])) {//出现相同的则说明重复
                    break;
                } else {//记录遍历过的字符
                    existed.add(chars[j]);
                    curMax++;
                }
            }
            if (curMax >= max) {
                max = curMax;
            }
        }
        //找出最大值
        return max;
    }


}
