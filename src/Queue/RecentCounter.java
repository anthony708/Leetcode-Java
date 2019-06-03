package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 933. Number of Recent Calls
 * Easy
 * @author zhuduan
 * 2019/05/24
 */

public class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
