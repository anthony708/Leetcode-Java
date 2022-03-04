package com.github.anthony708.java.Huawei;

import java.util.Scanner;

/**
 * Created by Anthony on 16/9/28.
 */
public class CountCharInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine().toLowerCase();
            char c = in.nextLine().toLowerCase().charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
