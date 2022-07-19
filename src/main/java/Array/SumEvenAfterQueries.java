package Array;

/**
 * 985. Sum of Even Numbers After Queries
 * Easy
 * @author zhuduan
 * 2019/06/13
 */

public class SumEvenAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res = new int[A.length];

        int sum = 0;
        for (int a: A) {
            if (a % 2 == 0) {
                sum += a;
            }
        }

        int i = 0;
        for (int[] q: queries) {
            if (A[q[1]] % 2 == 0) {
                sum -= A[q[1]];
            }
            A[q[i]] += q[0];
            if (A[q[1]] % 2 == 0) {
                sum += A[q[1]];
            }
            res[i] = sum;
            i++;
        }
        return res;
    }
}
