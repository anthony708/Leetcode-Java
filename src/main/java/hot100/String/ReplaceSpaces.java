package hot100.String;

/*
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）

 

示例 1：

输入："Mr John Smith    ", 13
输出："Mr%20John%20Smith"
示例 2：

输入："               ", 5
输出："%20%20%20%20%20"
 */

public class ReplaceSpaces {
    public static String replaceSpaces(String S, int length) {
        char[] temp = new char[length * 3];
        int i = 0; // i作为 S 的指针, i 最大有效值为 length - 1
        int j = 0; // j作为 temp 的指针
        while (i < length) {
            if (S.charAt(i) == ' ') {
                temp[j] = '%';
                j++;
                temp[j] = '2';
                j++;
                temp[j] = '0';
                j++;
            } else {
                temp[j] = S.charAt(i);
                j++;
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < j; k++) {
            sb.append(temp[k]);
        }
        return sb.toString();
    }

    public static String replaceSpaces_2(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String S = "Mr John Smith    ";
        int length = 13;
        System.out.println(replaceSpaces(S, length));

    }
}
