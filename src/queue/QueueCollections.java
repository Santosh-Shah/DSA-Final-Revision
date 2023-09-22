package queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(15);
        queue.add(17);
        System.out.println(queue.size());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
