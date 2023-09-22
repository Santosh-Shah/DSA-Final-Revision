package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q2_ReverseFirstKElement {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        int[] data = {1, 2, 3, 4};
        for (int ans : data) {
            queue.add(ans);
        }

        queue = reverseFirstKElement(queue, 4);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }

    // Method to reverse Queue
    public static Queue<Integer> reverseFirstKElement(Queue<Integer> input, int k) {
        // Base case
        if (k == 0 || k == 1 || input.size() == 0) {
            return input;
        }

        Queue<Integer> temp = new LinkedList<>();
        int count = k;
        while (count != 0) {
            temp.add(input.poll());
            count--;
        }
        
        reverse(temp);

        while (!input.isEmpty()) {
            temp.add(input.poll());
        }
//        input = temp;
        return temp;
    }

    private static void reverse(Queue<Integer> input) {
        // Base case
        if (input.size() <= 1) {
            return;
        }

        int temp = input.poll();
        reverse(input);
        input.add(temp);
    }
}
