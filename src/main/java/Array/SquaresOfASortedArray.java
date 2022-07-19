package Array;

/**
 * 977. Squares of a Sorted Array
 * Easy
 * @author zhuduan
 * 2019/05/20
 */


public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int [] res = new int[A.length];
        int i = 0;
        int j = A.length - 1;

        for (int k = A.length - 1; k >= 0; k--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                res[k] = A[i] * A[i];
                i++;
            } else {
                res[k] = A[j] * A[j];
                j--;
            }
        }
        return res;
    }
}
