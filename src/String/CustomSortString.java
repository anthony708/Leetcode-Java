package String;

/**
 * 791. Custom Sort String
 * Medium
 * @author zhuduan
 * 2019/07/18
*/

public class CustomSortString {
    public String customSortString(String S, String T) {
        int[] tbl = new int[26];

        StringBuilder sb = new StringBuilder();
        for (char c: T.toCharArray()) {
            tbl[c - 'a']++;
        }
        for (char c: S.toCharArray()) {
            for (int i = tbl[c - 'a']; i > 0; i--) {
                sb.append(c);
                tbl[c - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            int j = tbl[i];
            while (j > 0) {
                sb.append((char) ('a'+ i));
                j--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomSortString customSortString = new CustomSortString();
        String S = "cba";
        String T = "abcd";
        System.out.println(customSortString.customSortString(S, T));
    }
}
