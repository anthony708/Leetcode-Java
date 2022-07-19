package main.java.Array;


import java.util.ArrayList;
import java.util.List;

/**
 * 986. Interval List Intersections
 * Medium
 * @author zhuduan
 * 2019/05/30
 */

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][]A, int[][]B) {
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1], B[j][1]);
            if (start <= end) {
                res.add(new int[]{start, end});
            }
            if (A[i][1] > B[j][1]) {
                j++;
            } else {
                i++;
            }
        }

        int[][] ans = new int[res.size()][2];
        int k = 0;
        for (int[] pair: res) {
            ans[k++] = pair;
        }
        return ans;
    }
}
