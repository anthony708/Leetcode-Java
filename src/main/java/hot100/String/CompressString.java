package hot100.String;

/*
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。

示例 1：

输入："aabcccccaaa"
输出："a2b1c5a3"
示例 2：

输入："abbccd"
输出："abbccd"
解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。

 */


public class CompressString {
    public String compressString(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        char ch = S.charAt(0);

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != ch) {
                sb.append(ch);
                sb.append(cnt);
                cnt = 1;
                ch = S.charAt(i);
            } else {
                cnt++;
            }
        }
        sb.append(ch);
        sb.append(cnt);
        return sb.length() >= S.length() ? S : sb.toString();
    }
}
