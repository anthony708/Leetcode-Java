package com.github.anthony708.java.SwordForOffer.Sort;

/**
 * Created by Anthony on 16/4/14.
 */
public class QuickSort {
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1; // 把i设成负值, 作为向后移动的标志
        int j;
        for (j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, j);
        return i + 1;
    }
    private static void swap(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

    public static void quickSort(int array[], int start, int end) {
        int pivot;
        if (start < end) {
            pivot = partition(array, start, end);
            quickSort(array, start, pivot-1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {7,2,6,3,4,1,5};
        quickSort(array, 0, array.length - 1);
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
