/*
 * @Author: Anthony
 * @Date: 2022-06-26 18:37:17
 * @LastEditTime: 2022-06-26 20:41:09
 */
package com.github.anthony708.java.Course;

public class MergeSort {
    public static void mergeSort(int[] a) {
        //归并排序: 每次取左右两个下标, 将较小的数交换到p1位置
        if (a == null || a.length < 2) return;
        process(a, 0, a.length - 1);
    }

    public static void process(int[] a, int left, int right) {
        if (left == right) return;
        int mid = left + ((right - left) >> 1);
        process(a, left, mid);
        process(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    public static void merge(int[] a, int left, int mid, int right) {
        // 额外的空间
        int[] help = new int[right - left + 1];
        // p1和p2分别是两段的指针
        int p1 = left;      
        int p2 = mid + 1;
        // i表示落到help数组的位置
        int i = 0;
        while (p1 <= mid && p2 <= right) {
            help[i++] = a[p1] < a[p2] ? a[p1++] : a[p2++];
        }
        while (p1 <= mid) {
            help[i++] = a[p1++];
        }
        while (p2 <= right) {
            help[i++] = a[p2++];
        }
        for (i = 0; i < help.length; i++ ) {
            a[left + i] = help[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {3,5,1,4,6,2};
        mergeSort(a);
        for (int n: a) {
            System.out.println(n);
        }
    }
}
