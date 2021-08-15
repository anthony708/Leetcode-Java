package com.github.anthony708.java.Leetcode.Archive;

/**
 * Created by Anthony on 16/1/4.
 */
public class CharSort {
    public static void calcAllPermutation(char [] perm, int from, int to) {
        if (to <= 1) return;
        if (from == to) {
            for (int i = 0; i <= to; i++) {
                System.out.print(perm[i]);
            }
            System.out.println();
        } else {
            for (int j = from; j <= to; j++) {
                swap(j, from, perm);
                calcAllPermutation(perm, from + 1, to);
                swap(j, from, perm);
            }
        }
    }

    private static void swap(int index1, int index2, char [] array) {
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        calcAllPermutation("abc".toCharArray(), 0, 2);
    }
}
