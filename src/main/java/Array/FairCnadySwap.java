package Array;

/**
 * 888. Fair Candy Swap
 * Easy
 * @author zhuduan
 * 2019/06/26
 */

public class FairCnadySwap {
    public int[] fairCandySwap(int[]A, int[] B) {
       int sumA = 0, sumB = 0;
       for (int a: A) sumA += a;
       for (int b: B) sumB += b;

       int dif = (sumA - sumB) / 2;

       for (int i = 0; i < A.length; i++) {
           for (int j = 0; j < B.length; j++) {
               if ((A[i] - B[j]) == dif) {
                   return new int[] {A[i], B[j]};
               }
           }
       }
       return null;
    }
}
