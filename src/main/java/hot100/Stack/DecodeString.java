package hot100.Stack;

import java.util.Stack;

/*
 * 给定一个经过编码的字符串，返回它解码后的字符串。

编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。

你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。

此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。

 

示例 1：

输入：s = "3[a]2[bc]"
输出："aaabcbc"
示例 2：

输入：s = "3[a2[c]]"
输出："accaccacc"
示例 3：

输入：s = "2[abc]3[cd]ef"
输出："abcabccdcdcdef"
示例 4：

输入：s = "abc3[cd]xyz"
输出："abccdcdcdxyz"
 */

public class DecodeString {
    public String decodeString(String s) {
        // 临时当前要处理的字符串
        StringBuilder sb = new StringBuilder();
        // 负责res字符串
        Stack<StringBuilder> restack = new Stack<>();
        // 负责存[]前的数字
        Stack<Integer> kstack = new Stack<>();
        // k作为变量, 表示[]前的数字(可能超过个位数)
        int k = 0;

        for(Character c: s.toCharArray()) {
            if (c == '[') { 
                // 遇到'[' 则记录当前 k 和 res, 并且归零
                kstack.push(k);
                restack.push(sb);
                k = 0;
                sb = new StringBuilder();

            } else if (c == ']') {
                // 遇到']' 则k出栈, 计算当前 res
                int curk = kstack.pop();
                StringBuilder temp = new StringBuilder();
                for (int i = 0; i < curk; i++) {
                    temp.append(sb);
                }
                sb = restack.pop().append(temp);
            } else if (c >= '0' && c <= '9') {
                // 遇到数字则计算 k
                k = k * 10 + c - '0';
            } else {
                // 其他情况直接 append(c)
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        DecodeString ds = new DecodeString();
        System.out.println(ds.decodeString(s));
    }
}
