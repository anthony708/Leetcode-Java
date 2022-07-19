package com.github.anthony708.java.SwordForOffer.Sort;

/**
 * Created by Anthony on 16/4/14.
 */
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                System.out.println("for");
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    // 改进
    // 里面一层在某次扫描中没有执行交换,说明此时数组已经全部有序
    public static void bubbleSort2(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            flag = false;
            for (int j = 1; j < array.length - i; j++) {
                System.out.println("for");
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }

    public static void bubbleSort3(int[] array) {
        int last = 0;
        int lastTemp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            last = lastTemp;
            for (int j = array.length - 1; j > last; j--) {
                System.out.println("for");
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    lastTemp = j;
                }
            }
            if (last == lastTemp) {
                break;
            }
        }
    }


    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4,1,7,5,2,6,3};
        bubbleSort3(array);
        for (int k : array) {
            System.out.println(k);
        }
    }
}
