package hot100;

import java.util.ArrayList;
import java.util.List;

/*
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。


 */

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int l = 0, r = matrix[0].length - 1;
        int u = 0, d = matrix.length -1 ;

        while (l <= r && u <= d) {
            for (int j = l; j <= r && u <= d; j++) {
                res.add(matrix[u][j]);
            }
            u++;
            for (int i = u; i <= d && l <= r; i++) {
                res.add(matrix[i][r]);
            }
            r--;
            for (int j = r; j >= l && u <=d; j--) {
                res.add(matrix[d][j]);
            }
            d--;
            for (int i = d; i >= u && l <=r; i--) {
                res.add(matrix[i][l]);
            }
            l++;
        }
        return res;
    }
}
