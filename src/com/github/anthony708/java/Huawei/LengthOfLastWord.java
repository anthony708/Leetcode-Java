package com.github.anthony708.java.Huawei;

import java.util.Scanner;

/**
 * Created by Anthony on 16/9/28.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] sArr = str.split(" ");
            System.out.println(sArr[sArr.length - 1].length());
        }
    }
}
