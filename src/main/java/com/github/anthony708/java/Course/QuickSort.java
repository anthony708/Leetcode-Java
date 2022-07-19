/*
 * @Author: Anthony
 * @Date: 2022-06-26 18:37:55
 * @LastEditTime: 2022-06-26 22:22:34
 */
package com.github.anthony708.java.Course;

public class QuickSort {
    public static void quickSort(int[] a) {
        if (a == null || a.length < 2) return;
        // 快排1.0: 每次以a的最后一个数pivot为partition, 左边都大于pivot, 右边都小于pivot
        quickSort1(a, 0, a.length - 1);
        // 快排2.0: 每次以a的最后一个数pivot数组为partition, 左边都大于pivot, 右边都小于pivot
        // quickSort2(a, 0, a.length - 1);
        // 快排3.0: 每次以随机一个数pivot交换到a末尾, 并以pivot相同的数为partition数组, 左边都大于pivot, 右边都小于pivot
        // quickSort3(a, 0, a.length - 1);
    }

    

    public static void quickSort1(int[] a, int L, int R) {
        if (L < R) {
            int p = partition1(a, L, R);
            quickSort1(a, L, p - 1);
            quickSort1(a, p + 1, R);
        }
    }
    public static void quickSort2(int[] a, int L, int R) {
        if (L < R) {
            int []p = partition3(a, L, R);
            quickSort2(a, L, p[0] - 1);
            quickSort2(a, p[0] + 1, R);
        }
    }
    public static void quickSort3(int[] a, int L, int R) {
        if (L < R) {
            swap(a, L + (int)(Math.random() * (R - L + 1)), R);
            int []p = partition3(a, L, R);
            quickSort3(a, L, p[0] - 1);
            quickSort3(a, p[1] + 1, R);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition1(int[]a, int L, int R) {
        int lessBorder = L - 1;
        int index = L;
        while (index <= R) {                     // index作为移动的下标, lessBorder作为target的左边界
            if (a[index] < a[R]) {
                swap(a, index++, ++lessBorder);
            } else {
                index++;
            }
        }
        swap(a, lessBorder + 1, R);
        return lessBorder + 1;
    }

    public static int[] partition3(int[]a, int L, int R) {
        int lessBorder = L - 1;  // 小于区域的右边界
        int moreBorder = R;      // 大于区域的左边界, L作为下标游走
        int index = L;
        while (index < moreBorder) {
            if (a[index] < a[R]) {
                swap(a, ++lessBorder, index++);  // 将左边界向右, 并且和a[lessBorder]交换, 且index下标增加
            } else if (a[index] > a[R]) {
                swap(a, --moreBorder, index);    // 将右边界向左, 并且和a[moreBorder]交换, 但是index下标不增加
            }  else {
                index++;
            }  
        }
        swap(a, moreBorder, R);   // 将a[R] 和 大于a[R]的第一个数交换, 保证a[R]左侧的数都小于它, 右侧的数都大于它
        return new int[] {lessBorder + 1, moreBorder};
    }

    public static void main(String[] args) {
        int[] a = {3,5,2,1,6,4};
        quickSort(a);
        for(int n: a) {
            System.out.println(n);
        }
    }
}
