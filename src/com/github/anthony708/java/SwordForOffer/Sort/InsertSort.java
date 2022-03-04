package com.github.anthony708.java.SwordForOffer.Sort;

/**
 * Created by Anthony on 16/4/14.
 */

/*
    插入排序: 每次处理一个元素往后逐个比较,将该元素插入到合适位置中
 */

public class InsertSort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    swap(array, j, j-1);
                }
            }
        }
    }
    public static void swap(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

    public static void main(String[] args) {
        int[] array = {7,2,6,3,4,1,5};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}