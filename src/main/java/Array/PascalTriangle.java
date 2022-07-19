package main.java.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * #118 Merge Sorted Array
 * Easy
 * @author zhuduan
 * 2018/09/11
 */

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(resList.get(i-1).get(j-1) + resList.get(i-1).get(j));
                }
            }
        resList.add(list);
        }
        return resList;
    }
}
