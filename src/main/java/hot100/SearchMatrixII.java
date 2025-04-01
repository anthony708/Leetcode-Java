package hot100;

/*
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：

每行的元素从左到右升序排列。
每列的元素从上到下升序排列。

和 SearchMatrixI 不同之处在于: I 是矩阵每一行 z 字形依次递增, 整个属于递增序列; 而 II 是每行每列递增, 整体不符合
 */

public class SearchMatrixII {
    public static boolean searchMatrixII(int[][] matrix, int target) {
        // 直接查找, 遍历一遍
        for (int[] row: matrix) {
            for (int element: row) {
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchMatrixII_2(int[][] matrix, int target) {
        // 每一行用二分查找
        for (int[] row: matrix) {
            if (binarySearch(row, target) >= 0) {
                return true;
            }
        }
        return false;
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static boolean searchMatrixII_3(int[][] matrix, int target) {
        // z字形查找
        // 从矩阵的右上角(0, n-1)开始搜索
        // 搜索的 target 在 (x, y)位置, 则搜索的行位置为[x, m-1], 列位置为[0, y];
        // 如果 matrix[x, y] == target, 则这说明找到了该元素
        // 如果 matrix[x, y] > target, 则说明第 y 列元素都大于 target, 因此忽略这一列, y--;
        // 如果 matrix[x, y] < target, 则说明第 x 行元素都是小于 target, 因此忽略这一行, x++;
        
        int m = matrix.length, n = matrix[0].length;
        int x = 0, y = n - 1;
        while( x < m && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                y--;
            } else {
                x++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrixII_3(matrix, target));
    }
}
