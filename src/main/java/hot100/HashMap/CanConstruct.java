package hot100.HashMap;

/*
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

如果可以，返回 true ；否则返回 false 。

magazine 中的每个字符只能在 ransomNote 中使用一次。
 */

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] noteCnt = new int[26];
        int[] magCnt = new int[26];
        for (char c: ransomNote.toCharArray()) {
            noteCnt[c - 'a']++;
        }
        for (char c: magazine.toCharArray()) {
            magCnt[c-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (noteCnt[i] > magCnt[i]) {
                return false;
            }
        }
        return true;
    }
}
