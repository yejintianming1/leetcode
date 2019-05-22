package com.leetcode.problems.addTwoNumbers;

import com.alibaba.fastjson.JSON;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/21/2019</pre>
 */
public class SolutionTest extends TestCase {
    public SolutionTest(String name) {
        super(name);
    }

    private Solution solution;

    public void setUp() throws Exception {
        solution = new Solution();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Method: addTwoNumbers(ListNode l1, ListNode l2)
     */
    public void testAddTwoNumbers() throws Exception {

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        ListNode r1 = new ListNode(5);
        ListNode r2 = new ListNode(6);
        ListNode r3 = new ListNode(4);
        r1.next = r2;
        r2.next = r3;
        ListNode a1 = solution.addTwoNumbers(l1, r1);

        System.out.println(JSON.toJSONString(a1));

    }


    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }
}
