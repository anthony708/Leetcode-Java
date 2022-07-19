package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/25.
 */
public class Print1ToMaxOfNDigits {
    public static void Print1ToMaxOfNDigits(int n) {
        if (n <= 0) return;
        int array[] = new int[n];
        printArray(array, 0);

    }
    private static void printArray(int[] array,int n) {
        if (n != array.length) {
            for (int i = 0; i < 10; i++) {
                array[n] = i;
                printArray(array, n + 1);
            }
        } else {
            print(array);
        }
    }

    private static void print(int[] array) {
        int index = 0;

        //找到第一个非零元素
        while (index < array.length && array[index] == 0) {
            index++;
        }
        //从第一个非零元素输出到最后一个元素
        for (int i = index; i < array.length; i++) {
            System.out.print(array[i]);
        }
        //有非零元素需要换行
        if (index < array.length) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        Print1ToMaxOfNDigits(n);
    }
}
