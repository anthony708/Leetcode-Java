package String;

/**
 * 709. To Lower Case
 * Easy
 * @author zhuduan
 * 2019/05/29
 */

public class ToLowerCase {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public String toLowerCase2(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                c = (char) (c - 'A' + 'a');
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
