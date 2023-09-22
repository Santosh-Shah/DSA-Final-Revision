package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q1_ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        int[] data = {1, 2, 3, 4};
        for (int ans : data) {
            queue.add(ans);
        }

        reverseQueue(queue);

        while (queue.size() != 0) {
            System.out.print(queue.poll() + " ");
        }
    }

    // Method to reverse Queue
    public static void reverseQueue(Queue<Integer> input) {
        // Base case
        if (input.size() <= 1) {
            return;
        }

        int temp = input.poll();
        reverseQueue(input);
        input.add(temp);
    }
}
