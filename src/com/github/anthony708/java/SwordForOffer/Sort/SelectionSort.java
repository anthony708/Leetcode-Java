package com.github.anthony708.java.SwordForOffer.Sort;

/**
 * Created by Anthony on 16/4/14.
 */

/*
    选择排序: 从待排序数据中选一个最小的一个, 排序放在已排好的数列后面, 直到全部排完.
 */

public class SelectionSort {
    public static void sort(int[] array) {
        int minVal;
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minVal = array[i];
            minIndex = i;
            // 每次遍历找到剩下数中最小的数
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minVal) {
                    minVal = array[j];
                    minIndex = j;
                }
            }
            // 将最小的数和第i位的数互换位置
            if (minVal != array[i] && minIndex != i) {
                array[minIndex] = array[i];
                array[i] = minVal;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5,4,3,1};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
