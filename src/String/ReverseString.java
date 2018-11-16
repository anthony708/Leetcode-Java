package String;

/**
 * #344 Reverse String
 * Easy
 * @author zhuduan
 * 2018/11/16
 */

public class ReverseString {
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(reverseString(s));
    }
}
