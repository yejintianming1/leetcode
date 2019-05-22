package com.leetcode.problems.twoSum;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/21/2019</pre>
 */
public class SolutionTest extends TestCase {

    private Solution solution;

    public SolutionTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        solution = new Solution();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Method: twoSum(int[] nums, int target)
     */
    public void testTwoSum() throws Exception {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ints = solution.twoSum(nums, target);
        System.out.println(ints[0]+","+ints[1]);

    }


    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }
}
