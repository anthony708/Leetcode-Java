package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * #225 Implement Stack using Queues
 * Easy
 * @author zhuduan
 * 2018/11/09
 */

class ImplementStackusingQueues {

    private Queue<Integer> queue = new LinkedList<>();

    public ImplementStackusingQueues() {

    }

    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

