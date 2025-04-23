package hot100.Hash;

import java.util.HashMap;
import java.util.Map;

/*
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。

如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。

每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。

 */

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        // 维护两张 hash 表的映射关系, s与 t 中的字符一一对应

        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();

        int l = s.length();
        for (int i = 0; i < l; i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            } 
            s2t.put(x, y);
            t2s.put(y, x);
        }

        return true;
    }
}
