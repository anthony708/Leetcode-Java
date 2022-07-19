package main.java.Array;

import java.util.Arrays;

/**
 * 561. Array Partition I
 * Easy
 * @author zhuduan
 * 2019/05/29
 */

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
