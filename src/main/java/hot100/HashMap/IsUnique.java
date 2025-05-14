package hot100.HashMap;

import java.util.HashSet;
import java.util.Set;

/*
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。

示例 1：

输入: s = "leetcode"
输出: false 
示例 2：

输入: s = "abc"
输出: true
 */

public class IsUnique {
    public boolean isUnique(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        Set<Character> set = new HashSet<>();
        for (Character c: str.toCharArray()) {
            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }
        return true;
    }
}
