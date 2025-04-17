package hot100.String;

/*
 * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。

字母和数字都属于字母数字字符。

给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
*/

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        char[] cArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c: cArr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
            } else {
                continue;
            }
        }
        String newStr = sb.toString();
        char[] newArr = newStr.toCharArray();

        int l = 0, r = newArr.length - 1;
        while (l < r) {
            if (newArr[l] != newArr[r]) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
