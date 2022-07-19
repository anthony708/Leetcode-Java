package com.github.anthony708.java.SwordForOffer.Sort;

/**
 * Created by Anthony on 16/9/26.
 */
public class HeapSort {
    public static void heapSortAsc(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            maxHeapDown(array, i, array.length - 1);
        }
        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            maxHeapDown(array, 0, i - 1);
        }
    }

    public static void maxHeapDown(int[] array, int start, int end) {
        int cur = start;
        int temp = array[cur];
        for (int l = 2 * cur + 1; l <= end; cur = l, l = 2 * l + 1) {
            if (l < end && array[l] < array[l + 1]) {
                l++;
            }
            if (array[l] < temp) {
                break;
            } else {
                array[cur] = array[l];
                array[l] = temp;
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1,0,-1,-2,-3};
        heapSortAsc(array);
        for (int value: array) {
            System.out.println(value);
        }
    }
}
