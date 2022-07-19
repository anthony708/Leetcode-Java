package String;

/**
 * #125 Valid Palindrome
 * Easy
 * @author zhuduan
 * 2018/09/14
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
