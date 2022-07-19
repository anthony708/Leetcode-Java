package main.java.Array;

import java.util.Arrays;
import java.util.Stack;

/**
 * 503. Next Greater Element II
 * Medium
 * @author zhuduan
 * 2019/05/17
 */

public class NextGreaterElementII {
    public static int[] nextGreaterElemenets(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int []res = new int[nums.length];
        Arrays.fill(res, -1);

        for (int i = 0; i < nums.length * 2; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % nums.length]) {
                res[stack.pop()] = nums[i % nums.length];
            }
            if (i < nums.length) {
                stack.push(i);
            }
        }

        return res;
    }


}
