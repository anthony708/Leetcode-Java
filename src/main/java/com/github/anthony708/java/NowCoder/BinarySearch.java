package com.github.anthony708.java.NowCoder;

import java.util.*;

class BinarySearch {
    /**
     * 二分查找
     * @param targer int整型 查找值
     * @param low int整型 查找起点
     * @param high int整型 查找终点
     * @param a int整型一维数组 有序数组 且其中有重复数字
     * @return int整型, 第一个符合条件的数组下标; 如果没有找到, 则返回-1;
     */
    public static int binarySearch(int low, int high, int[]a, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low + 1;
    }
    public static void main(String[] args) {
        int target = 3;
        int[] a = {1,1,2,4,4,5};
        System.out.println(binarySearch(0, a.length, a, 4));
    }
}