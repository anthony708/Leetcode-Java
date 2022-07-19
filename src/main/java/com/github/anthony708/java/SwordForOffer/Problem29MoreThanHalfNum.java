package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/5/13.
 */

/*
    数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
     遍历数组保留两个值, 数组中的数字和次数
     要找的数字是最后一个把次数设为1的数字
 */

public class Problem29MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) return 0 ;
        int result = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (count == 0) {
                result = array[i];
                count = 1;
            } else if (result == array[i]) {
                count++;
            } else {
                count--;
            }
        }

        if (!checkMoreThanHalf(array, result)) {
            return 0;
        } else {
            return result;
        }
    }

    private boolean checkMoreThanHalf(int[] array, int number) {
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                times++;
            }
        }
        if (times * 2 <= array.length) {
            return false;
        } else {
            return true;
        }
    }
}
