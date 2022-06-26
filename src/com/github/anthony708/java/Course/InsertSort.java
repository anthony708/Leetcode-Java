/*
 * @Author: Anthony
 * @Date: 2022-06-26 18:15:47
 * @LastEditTime: 2022-06-26 18:24:10
 */
package com.github.anthony708.java.Course;

public class InsertSort {
    public static void insertSort(int[] a) {
        if (a == null || a.length < 2) return;
        // 插入排序: 每次遍历选择i位置上的数插入到前面合适的位置, 使0~i有序
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = i - 1; j >=0 && a[j] > a[j+1]; j--) {
                swap(a, j, j+1);
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
        insertSort(a);
        for (int n: a) {
            System.out.println(n);
        }
    }
}
