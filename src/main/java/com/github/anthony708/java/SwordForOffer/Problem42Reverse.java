package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/9/19.
 */
public class Problem42Reverse {
    public static String ReverseSentence(String str) {
        if (str == null || str.trim().equals("")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
            sb.append(" ");
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "I am a student.";
        System.out.println(ReverseSentence(str));
    }

}
