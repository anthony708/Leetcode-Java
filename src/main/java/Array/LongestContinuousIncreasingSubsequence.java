package main.java.Array;

/**
 * 674. Longest Continuous Increasing Subsequence
 * Easy
 * @author zhuduan
 * 2019/07/16
 */

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int startIndex = 0;
        int endIndex = 0;
        int res = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                endIndex++;
            } else {
                res = Math.max(res, endIndex - startIndex + 1);
                endIndex = i;
                startIndex = i;
            }
        }

        res = Math.max(res, endIndex - startIndex + 1);

        return res;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequence = new LongestContinuousIncreasingSubsequence();
        int[] nums = {1,3,5,7};
        System.out.println(longestContinuousIncreasingSubsequence.findLengthOfLCIS(nums));
    }
}
