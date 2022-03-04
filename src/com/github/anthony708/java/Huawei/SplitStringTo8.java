package com.github.anthony708.java.Huawei;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Anthony on 16/9/28.
 */
public class SplitStringTo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.length() == 0) {
                continue;
            }
            Queue<Character> queue = new ArrayDeque<>();
            for (char c : str.toCharArray()) {
                queue.add(c);
                if (queue.size() == 8) {
                    for (int i = 0; i < 8; i++) {
                        System.out.print(queue.poll());
                    }
                    System.out.println();
                }
            }
            int size = queue.size();
            if (size == 0) {
                continue;
            }
            for (int i = 0; i < 8 - size; i++) {
                queue.add('0');
            }
            while (!queue.isEmpty()) {
                System.out.print(queue.poll());
            }
            System.out.println();
        }
    }
}
