package Array;

/**
 * 48. Rotate Image
 * Medium
 * @author zhuduan
 * 2019/06/14
 */

public class RotateImage {
    public static void rotateImage(int[][] matrix) {

        /*
          First reverse up and down, then swap the symmetry
            1 2 3      7 8 9      7 4 1
            4 5 6  =>  4 5 6  =>  8 5 2
            7 8 9      1 2 3      9 6 3
         */
        transpose(matrix);
        for (int row = 0; row < matrix.length; row++) {
            int i = 0, j = matrix[row].length - 1;
            while (i < j) {
                int tmp = matrix[row][i];
                matrix[row][i++] = matrix[row][j];
                matrix[row][j--] = tmp;
            }
        }

    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
