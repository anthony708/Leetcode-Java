package BinarySearch;

/**
 * 852. Peak Index in a Mountain Array
 * Easy
 * @author zhuduan
 * 2019/06/03
 */


public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i-1]) {
                return i-1;
            }
        }
        return -1;
    }

    // Binary Search
    public int peakIndexMountainArray2(int[] A) {
        int i = 0, j = A.length - 1;

        while (i < j) {
            int mid = i + (j - i) / 2;
            if (A[mid] > A[mid - 1]) {
                i = mid;
            } else if (A[mid] < A[mid - 1]) {
                j = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
