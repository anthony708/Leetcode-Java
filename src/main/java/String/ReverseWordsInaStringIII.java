package String;

/**
 * 557. Reverse Words in a String III
 * Easy
 * @author zhuduan
 * 2019/06/17
 */

public class ReverseWordsInaStringIII {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String res = "";
        for (String str: strs) {
            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1; i >=0; i--) {
                sb.append(str.charAt(i));
            }
            res += sb.toString() + " ";
        }
        int length = res.length();
        return res.substring(0, length - 1);
    }
}
