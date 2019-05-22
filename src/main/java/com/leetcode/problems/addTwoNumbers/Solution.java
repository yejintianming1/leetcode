package com.leetcode.problems.addTwoNumbers;


/**
 * 题目描述
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

import com.alibaba.fastjson.JSON;

import javax.sound.midi.Soundbank;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

//    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//    输出：7 -> 0 -> 8
//    原因：342 + 465 = 807
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode s1 = new ListNode((l1.val + l2.val)%10);
        if (l1.next == null && l2.next != null) {//补齐
            l1.next = new ListNode(0);
        } else if (l1.next != null && l2.next == null) {
            l2.next = new ListNode(0);
        }
        if ((l1.val + l2.val)>=10) {//高位进一
            if (l1.next != null) {
                l1.next.val = l1.next.val+1;
            } else {//此时进一结束
                s1.next = new ListNode(1);
                return s1;
            }
        }
        s1.next = addTwoNumbers(l1.next,l2.next);
        return s1;
    }

}
