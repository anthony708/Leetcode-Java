package Math;

/**
 * #9 Palindrome Number
 * Easy
 * @author zhuduan
 * 2018/10/08
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0) ) return false;
        int xx = 0;
        while (x > xx) {
            xx = xx * 10 + x % 10;
            x /= 10;
        }
        return (x == xx || x == xx/10);
    }
}
