package main.java.Array;

/**
 * 1013. Partition Array Into Three Parts With Equal Sum
 * Easy
 * @author zhuduan
 * 2019/06/26
 */

public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;
        for (int a: A) {
            sum += a;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int avg = sum / 3;

        int cur = 0, cnt = 0;
        for (int a: A) {
            cur += a;
            if (cur != avg) {
                continue;
            }
            if (cnt++ == 3) {
                return true;
            }
            cur = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {3,3,6,5,-2,2,5,1,-9,4};
        PartitionArrayIntoThreePartsWithEqualSum partitionArrayIntoThreePartsWithEqualSum = new PartitionArrayIntoThreePartsWithEqualSum();
        System.out.println(partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(A));
    }

}
