package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * #345 Reverse Vowels of a String
 * Easy
 * @author zhuduan
 * 2018/11/16
 */

public class ReverseVowelsofaString {
    public static String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));

        char[] carr = s.toCharArray();
        for (int i = 0, j = carr.length - 1; i < j; ) {
            if (!set.contains(carr[i])) {
                i++;
                continue;
            }
            if (!set.contains(carr[j])) {
                j--;
                continue;
            }
            char temp = carr[i];
            carr[i] = carr[j];
            carr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(carr);
    }

    public static void main(String[] args) {
        String s = "Live on evasions? No, I save no evil.";
        System.out.print(reverseVowels(s));
    }
}
