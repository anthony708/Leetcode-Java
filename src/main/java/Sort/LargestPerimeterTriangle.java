package Sort;

/**
 * 976. Largest Perimeter Triangle
 * Easy
 * @author zhuduan
 * 2019/05/24
 */

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; i--) {
            if (A[i] < A[i-1] + A[i-2]) {
                return A[i] + A[i-1] + A[i-2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] A = {3,2,3,4};
        System.out.println(largestPerimeter(A));
    }
}
