package Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 950. Reveal Cards In Increasing Order
 * Medium
 * @author zhuduan
 * 2019/05/16
 */

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < deck.length; i++) {
            queue.add(i);
        }

        int[] res = new int[deck.length];

        for (int i = 0; i < deck.length; i++) {
            res[queue.poll()] = deck[i];
            queue.add(queue.poll());
        }
        return res;
    }
}
