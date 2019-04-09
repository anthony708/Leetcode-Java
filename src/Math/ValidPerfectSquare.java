package Math;

/**
 * #367 Valid Perfect Square
 * Easy
 * @author zhuduan
 * 2018/11/21
 */

public class ValidPerfectSquare {
    // Solution1: A square number is the sum of odd numbers: 1+3+5+7+...
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i+=2;
        }
        return num == 0;
    }

    // Solution2: BinarySearch
    public boolean isPerfectSquare2(int num) {
        int low = 1;
        int high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid < num) {
                low = (int)mid + 1;
            } else {
                high = (int)mid - 1;
            }
        }
        return false;
    }
}
