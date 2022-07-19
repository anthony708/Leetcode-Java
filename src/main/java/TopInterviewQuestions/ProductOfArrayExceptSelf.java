package main.java.TopInterviewQuestions;

/*
    238. Product of Array Except Self
    Medium
    2019-08-09
 */

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i < nums.length - 1) {
                right *= nums[i + 1];
            }
            res[i] *= right;
        }
        return res;
    }
}
