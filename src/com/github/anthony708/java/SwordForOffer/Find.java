package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/7/18.
 */
public class Find {
    public boolean Find(int target, int [][] array) {
        int row = 0;
        int col = array[0].length - 1;
        while (row <= array.length - 1 && col >= 0) {
            if (target < array[row][col]) {
                col--;
            } else if (target > array[row][col]) {
                row++;
            } else if (target == array[row][col]) {
                return true;
            }
        }
        return false;
    }
}
