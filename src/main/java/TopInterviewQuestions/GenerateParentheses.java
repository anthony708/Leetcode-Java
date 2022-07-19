package main.java.TopInterviewQuestions;

import java.util.*;

/*
    22. Generate Parentheses
    Medium
    2019-08-08
 */

public class GenerateParentheses {
    public List<String> generateParentheses(int n) {
        Map<Integer, List<String>> memo = new HashMap<>();
        memo.put(0, Arrays.asList(""));
        memo.put(1, Arrays.asList("()"));
        memo.put(2, Arrays.asList("()()", "(())"));
        return generate(n, memo);
    }

    private List<String> generate(int n, Map<Integer, List<String>> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.addAll(merge(generate(i, memo), generate(n - 1 - i, memo)));
        }

        memo.put(n, res);
        return res;
    }

    private List<String> merge(List<String> inner, List<String> outer) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < inner.size(); i++) {
            for (int j = 0; j < outer.size(); j++) {
                res.add("(" + inner.get(i) + ")" + outer.get(i));
            }
        }
        return res;
    }
}
