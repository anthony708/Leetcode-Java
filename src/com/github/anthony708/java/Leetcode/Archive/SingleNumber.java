package com.github.anthony708.java.LeetCode.Archive;

/**
 * Created by Anthony on 15/11/13.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int[] digits = new int[32];
        int res = 0;
        for(int i = 0; i < 32; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(((nums[j] >> i) & 1) != 0) {
                    digits[i]++;
                }
            }
            res |= ((digits[i] % 3) << i);
        }
        return res;
    }
}
