/*
 * @Author: Anthony
 * @Date: 2022-06-26 17:50:29
 * @LastEditTime: 2022-06-26 18:16:17
 */
package com.github.anthony708.java.Course;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        if (a == null || a.length < 2) return;
        // 冒泡排序: 每次遍历将最大的数放到最后第i位
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
    
    public static void main(String[] args) {
        int [] a = {3,5,2,1,6,4};
        bubbleSort(a);
        for (int n: a) {
            System.out.println(n);
        }
    }
}
