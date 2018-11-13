package Array;

/**
 * #66 Plus One
 * Easy
 * @author zhuduan
 * 2018/09/10
 */

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        if (digits[0] == 0) {
            int res[] = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        int digits[] = {9,9,9};
        plusOne(digits);
    }

}
