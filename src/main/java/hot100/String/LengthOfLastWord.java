package hot100.String;

/*
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。

单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。


 */

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length - 1].length();
    }

    public static int lengthOfLastWord2(String s) {
        int cnt = 0;
        int p = s.length() - 1;
        // 先排除最后的空格
        while (s.charAt(p) == ' ') {
            p--;
        }

        for (int i = p; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "  Hello World   ";
        System.out.println(lengthOfLastWord2(s));
    }
}
