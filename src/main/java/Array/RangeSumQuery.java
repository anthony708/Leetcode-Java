package main.java.Array;

/**
 * #303 Range Sum Query - Immutable
 * Easy
 * @author zhuduan
 * 2018/11/16
 */

public class RangeSumQuery {
    int []res;
    public RangeSumQuery(int[] nums) {
        res = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            res[i+1] = nums[i] + res[i];
        }
    }

    public int sumRange(int i, int j) {
        return res[j + 1] - res[i];
    }
}
