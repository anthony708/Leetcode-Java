package String;

import java.util.ArrayList;
import java.util.List;

/**
 * 763. Partition Labels
 * Medium
 * @author zhuduan
 * 2019/06/06
 */

public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();

        // find the last occurence of each letter and record them in last[]
        int[] last = new int[26];

        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        int start = -1, end = -1;

        for (int i = 0; i < S.length(); i++) {
            if (start == -1) {
                start = i;
            }
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (end == i) {
                list.add(end - start + 1);
                start = -1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "ababcbacbdefegdehijhklij";
        for (int i: partitionLabels(s)) {
            System.out.print(i + " ");
        }
    }
}
