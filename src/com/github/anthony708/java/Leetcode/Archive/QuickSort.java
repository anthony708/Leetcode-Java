package com.github.anthony708.java.Leetcode.Archive;

/**
 * Created by Anthony on 15/11/9.
 */
public class QuickSort {

    private static int partion(int array[], int start, int end) {
        int x = array[end];
        int i = start - 1; // 把i设成负值, 作为向后移动的标志
        int j;
        for (j = start; j < end; j++) {
            if (array[j] <= x) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, j);
        return i + 1;
    }

    private static void swap(int[] s, int a, int b) {
        int temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }

    public static void QuickSort(int[] array, int start, int end) {
        if (start < end) {
            int q = partion(array, start, end);
            QuickSort(array, start, q - 1);
            QuickSort(array, q + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {4,3,1,5,6,2};
        QuickSort(array, 0, array.length - 1);
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
