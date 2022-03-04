package com.github.anthony708.java.SwordForOffer;

import java.util.ArrayList;

/**
 * Created by Anthony on 16/4/29.
 */

/*
    继续循环条件是(columns > start * 2 && rows > start * 2)
 */
public class Problem20PrintMatrixClockwisely {
//    public void printMatrix(int[][] matrix) {
//
//        int row = matrix.length;
//        int col = matrix[0].length;
//        if (matrix == null || col <= 0 || row <= 0) return;
//
//        int start = 0;
//        while (col > 2 * start && row > 2 * start) {
//            printInCircle(matrix, start);
//            start++;
//        }
//    }
//
//    private void printInCircle(int[][] matrix, int start) {
//        int endX = matrix[0].length - start - 1;
//        int endY = matrix.length - start - 1;
//        for (int i = start; i <= endX; i++) {
//            System.out.println(matrix[start][i]);
//        }
//
//        // 第二步前提条件是: 终止行号大于起始行号
//        if (endY > start) {
//            for (int i = start + 1; i <= endY; i++) {
//                System.out.println(matrix[i][endX]);
//            }
//        }
//
//        // 第三步前提条件是: 圈内至少有两行两列
//        if (start < endX && start < endY) {
//            for (int i = endX - 1; i >= start; i--) {
//                System.out.println(matrix[endY][i]);
//            }
//        }
//
//        // 第四步前提条件是: 至少有三行两列
//        if (start < endX && start < endY - 1) {
//            for (int i = endY - 1; i >= start + 1; i--) {
//                System.out.println(matrix[i][start]);
//            }
//        }
//
//    }

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        if (matrix == null || row <= 0 || col <= 0) return null;
        int start = 0;
        while (col > 2 * start && row > 2 * start) {
            printInCircle(matrix, start, result);
            start++;
        }
        return result;
    }

    private static ArrayList<Integer> printInCircle(int[][] matrix, int start, ArrayList<Integer> result) {
        int endX = matrix[0].length - 1 - start;
        int endY = matrix.length - 1 - start;
        for (int i = start; i <= endX; i++) {
            result.add(matrix[start][i]);
        }
        if (endY > start) {
            for (int i = start + 1; i <= endY; i++) {
                result.add(matrix[i][endX]);
            }
        }

        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                result.add(matrix[endY][i]);
            }
        }

        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--) {
                result.add(matrix[i][start]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printMatrix(matrix));
    }
}
