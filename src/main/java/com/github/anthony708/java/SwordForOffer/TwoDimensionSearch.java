package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/9.
 */
public class TwoDimensionSearch {
    public  static boolean Find(int [][] array, int target) {
        int m = 0;
        int n = array[0].length;
        while (n > 0 && m <= array.length - 1) {
            if (array[m][n-1] > target) {
                n--;
            } else if (array[m][n-1] < target) {
                m++;
            } else {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 5;
        System.out.println(Find(array, target));
    }
}
