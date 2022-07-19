/*
 * @Author: Anthony
 * @Date: 2022-06-29 00:38:32
 * @LastEditTime: 2022-06-29 00:48:20
 */
package com.github.anthony708.java.Course;

public class HeapSort {
    public static void heapSort(int[] a) {
        if (a == null || a.length <= 1) return;
        for (int i = 0; i < a.length; i++) {
            heapInsert(a, i);
        }
        int heapSize = a.length;
        swap(a, 0, --heapSize);
        while (heapSize > 0) {
            heapify(a, 0, heapSize);
            swap(a, 0, --heapSize);
        }
    }
    
    public static void heapInsert(int[] a, int index) {
        while (a[index] > a[(index - 1) / 2]) {
            swap(a, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] a, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && a[left] < a[left + 1] ? left + 1 : left;
            largest = a[index] > a[largest] ? index : largest;
            if (index == largest) break;
            swap(a, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int [] a = {3,5,2,1,6,4};
        heapSort(a);
        for(int n: a) {
            System.out.println(n);
        }
    }
}
