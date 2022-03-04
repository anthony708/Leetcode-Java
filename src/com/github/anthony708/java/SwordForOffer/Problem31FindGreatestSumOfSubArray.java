package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/5/20.
 */

/*
    连续子数组最大和
        curSum为负值, 则更新; 否则加上当前值
        若sum < curSum, 则更新sum
 */

public class Problem31FindGreatestSumOfSubArray {

    // 注意sum和curSum初始化从array[0]开始不能设为0, 考虑数组全是负数的情况
    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        int curSum = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (curSum <= 0) {
                curSum = array[i];
            } else {
                curSum += array[i];
            }
            if (curSum > sum) {
                sum = curSum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(array));
    }
}
