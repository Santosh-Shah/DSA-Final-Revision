package priorityqueue;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(5);
//        System.out.println(set.size());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(56);
        System.out.println(pq.peek());

    }
}
