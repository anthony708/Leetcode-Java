package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/9.
 */
public class ReplaceBlank {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer newStr = new StringBuffer();
        String sti = str.toString();
        char[] charStr = sti.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            if (charStr[i] == ' ') {
                newStr.append("%20");
            } else {
                newStr.append(charStr[i]);
            }

        }
        return newStr.toString();
    }
}
