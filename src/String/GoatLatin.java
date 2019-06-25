package String;

/**
 * 824. Goat Latin
 * Easy
 * @author zhuduan
 * 2019/06/25
 */

public class GoatLatin {
    public String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (!isTheFirstLetterVowel(strings[i])) {
                strings[i] = reverseLetters(strings[i]);
            }
            strings[i] += "ma";
            strings[i] += nTimesA(i+1, "a");
        }

        String res = "";
        for (String str: strings) {
            res += str + " ";
        }
        return res.substring(0, res.length() - 1);
    }

    private boolean isTheFirstLetterVowel(String s) {
        char c = s.toLowerCase().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    private String reverseLetters(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        sb.append(s.charAt(0));
        return sb.toString();
    }

    private String nTimesA(int n, String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        GoatLatin goatLatin = new GoatLatin();
        System.out.println(goatLatin.toGoatLatin(s));
    }
}
