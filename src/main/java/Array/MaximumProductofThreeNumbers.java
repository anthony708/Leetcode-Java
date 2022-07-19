package main.java.Array;

import java.util.Arrays;

/**
 * 628. Maximum Product of Three Numbers
 * Easy
 * @author zhuduan
 * 2019/07/16
 */

public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int res1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int res2 = nums[0] * nums[1] * nums[nums.length - 1];

        return Math.max(res1, res2);
    }
}
