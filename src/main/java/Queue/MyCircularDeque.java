package Queue;

import java.util.ArrayList;
import java.util.List;

public class MyCircularDeque {
    List<Integer> list;
    int front;
    int rear;
    int length;

    public MyCircularDeque(int k) {
        list = new ArrayList<>();
        front = -1;
        rear = -1;
        length = k;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (list.size() == 0) {
            rear = 0;
            front = 0;
            list.add(value);
        } else {
            list.add(0, value);
            rear++;
        }
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        if (list.size() == 0) {
            rear = 0;
            front = 0;
            list.add(value);
        } else {
            list.add(value);
            rear++;
        }
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        list.remove(0);
        rear--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        list.remove(rear);
        rear--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(0);
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(rear);
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (list.size() == length) {
            return true;
        }
        return false;
    }
}
