/*
 * @Author: Anthony
 * @Date: 2022-06-26 17:46:00
 * @LastEditTime: 2022-06-26 18:16:09
 */
package com.github.anthony708.java.Course;

public class SelectSort {
    public static void selectSort(int[] a) {
        if (a == null || a.length < 2) return;
        // 选择排序: 每次遍历选到最小的一个数, 放到i位置
        for(int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            swap(a, i, minIndex);
        }
    }

    public static void swap(int[] a, int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }

    public static void main(String[] args) {
        int [] a = {3,5,2,1,6,4};
        selectSort(a);
        for (int n: a) {
            System.out.println(n);
        }
    }
}
