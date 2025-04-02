package hot100.Matrix;

/*
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。

你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 */

public class Rotate {
    public void rotate(int[][] matrix) {
        // matrix[i][j] -> matrix_new[j][n-i-1]
        // 遍历数组将它放到对应位置即可
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n-i-1] = matrix[i][j];
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }

    public void rotate_2(int[][] matrix) {
        // 原地旋转, 不使用额外空间: 如果我们直接将 matrix[row][col] 放到原矩阵中的目标位置 matrix[col][n−row−1], 则原矩阵中的目标位置 matrix[col][n−row−1]就被覆盖了
        // 因此需要一个临时变量 temp暂存matrix[col][n−row−1]
        // matrix[col][n−row−1]通过旋转 -> matrix[n-row-1][n-col-1]
        // 因此需要一个临时变量 temp暂存 matrix[n-row-1][n-col-1]
        // matrix[n-row-1][n-col-1] 通过旋转 -> matrix[n-col-1][row]
        // 最后一次, matrix[n-col-1][row]通过旋转 -> matrix[row][col]
        
        // 因此这四项处于一个循环中:   matrix[row][col] -> matrix[col][n−row−1] -> matrix[n-row-1][n-col-1] -> matrix[n-col-1][row] ->  matrix[row][col] 

        // 另外的, n 区分奇数和偶数
        // n 为偶数时, 划分为四块
        // n 为奇数时, 中心位置通过旋转后位置不变, 可以不旋转

        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
}
