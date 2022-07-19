package TopInterviewQuestions;

/*
    347. Top K Frequent Elements
    Medium
    2019-08-08
 */

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int n: map.keySet()) {
            int freq = map.get(n);
            if (bucket[freq] == null) {
                bucket[freq] = new LinkedList<>();
            }
            bucket[freq].add(n);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = bucket.length - 1; i > 0 && k > 0; i--) {
            if (bucket[i] != null) {
                List<Integer> list = bucket[i];
                res.addAll(list);
                k -= list.size();
            }
        }
        return res;
    }

    public List<Integer> topKFrequentM2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // use maxHeap. Put entry into maxHeap, so can always poll a number with largest frequency
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();
        while (res.size() < k) {
            res.add(maxHeap.poll().getKey());
        }
        return res;
    }
}
