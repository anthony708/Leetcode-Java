package String;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. Ransom Note
 * Medium
 * @author zhuduan
 * 2019/04/29
 */

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c: magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c: ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0) - 1;
            if (count < 0) {
                return false;
            }
            map.put(c, count);
        }
        return true;
    }
}
