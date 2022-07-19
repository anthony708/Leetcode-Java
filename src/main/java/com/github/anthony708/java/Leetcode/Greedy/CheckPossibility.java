/*
 * @Author: Anthony
 * @Date: 2021-08-29 23:19:36
 * @LastEditTime: 2021-08-29 23:37:16
 */
package com.github.anthony708.java.LeetCode.Greedy;

/**
 * 665. 非递减数列
 * 给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 * 我们是这样定义一个非递减数列的： 对于数组中任意的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
 * 
 * 分析: 加上边界：i>0 && i<n-2 && nums[i-1]>nums[i+1] && nums[i]>nums[i+2]
 */

public class CheckPossibility {
    public static boolean checkPossibility(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                if (flag) {
                    return false;
                } 
                flag = true;
                if (i > 0 && i < nums.length-2 && nums[i-1] > nums[i+1] && nums[i] > nums[i+2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,3};
        System.out.println(checkPossibility(nums));
    }
}
