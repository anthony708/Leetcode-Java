package com.github.anthony708.java.Leetcode.Archive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony on 15/12/11.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0) return list;

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        int num = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                list.add(matrix[rowStart][i]);
            }
            rowStart ++;
            for (int i = rowStart; i <= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd --;
            for (int i = colEnd; i >= colStart; i--) {
                if (rowStart <= rowEnd) {
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd --;
            for (int i = rowEnd; i >= rowStart; i--) {
                if (colStart <= colEnd) {
                    list.add(matrix[i][colStart]);
                }
            }
            colStart ++;
        }
        return list;
    }
}
