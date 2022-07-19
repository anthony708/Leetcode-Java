package main.java.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 830. Positions of Large Groups
 * Easy
 * @author zhuduan
 * 2019/07/15
 */

public class PositionsofLargeGroups {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> resList = new ArrayList<>();

        int startIndex = 0;
        int endIndex = 0;
        char lastChar = S.charAt(0);
        for (int i = 0; i < S.length(); i++) {

            char temp = S.charAt(i);
            if (temp == lastChar) {
                endIndex++;
            } else {
                if (endIndex - startIndex > 1) {
                    List<Integer> list = new ArrayList<>();
                    list.add(startIndex);
                    list.add(endIndex);
                    resList.add(list);
                }
                startIndex = i;
                endIndex = i;
                lastChar = temp;
            }

        }

        if (endIndex - startIndex > 1) {
            List<Integer> list = new ArrayList<>();
            list.add(startIndex);
            list.add(endIndex);
            resList.add(list);
        }

        return resList;
    }

    public static void main(String[] args) {
        PositionsofLargeGroups positionsofLargeGroups = new PositionsofLargeGroups();

        String s = "abcdddeeeeaabbbcd";
        List<List<Integer>> list = positionsofLargeGroups.largeGroupPositions(s);

        for (List<Integer> l: list) {
            System.out.println(l);
        }
    }
}
