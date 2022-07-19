package main.java.Array;

/**
 * 867. Transpose Matrix
 * Easy
 * @author zhuduan
 * 2019/06/13
 */

public class TransposeMatrix {
    public static int[][] transpose(int[][] A) {
        int m = A.length, n = A[0].length;
        int [][] transA = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transA[i][j] = A[j][i];
            }
        }
        return transA;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6}};
        int m = A.length, n = A[0].length;
        int[][] transA = transpose(A);

        for (int i = 0; i < transA.length; i++) {
            for (int j = 0; j < transA[0].length; j++) {
                System.out.print(transA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
