package String;

/**
 * #14 Longest Common Prefix
 * Easy
 * @author zhuduan
 * 2018/09/12
 */

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder resStr = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (String s:strs) {
                if (s.length() < i+1 || s.charAt(i) != c) {
                    return resStr.toString();
                }
            }
            resStr.append(c);
        }
        return resStr.toString();
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(strs));
    }
}
