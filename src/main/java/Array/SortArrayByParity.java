package main.java.Array;

/**
 * 905. Sort Array By Parity
 * Easy
 * @author zhuduan
 * 2019/05/16
 */

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int head = 0;
        int tail = A.length - 1;

        for(int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                result[head] = A[i];
                head++;
            } else {
                result[tail] = A[i];
                tail--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        int[] result = sortArrayByParity(A);
        for (int i: result) {
            System.out.print(i + " ");
        }
    }
}
