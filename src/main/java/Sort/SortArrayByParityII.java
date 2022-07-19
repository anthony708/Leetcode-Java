package Sort;

/**
 * 922. Sort Array By Parity II
 * Easy
 * @author zhuduan
 * 2019/05/23
 */

public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int i = 0, j = 1;
        for (int k = 0; k < A.length; k++) {
            if (A[k] % 2 == 0) {
                res[i] = A[k];
                i += 2;
            } else {
                res[j] = A[k];
                j += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {4,2,5,7};
        int[] res = sortArrayByParityII(A);
        for (int n: res) {
            System.out.print(n + " ");
        }
    }
}
