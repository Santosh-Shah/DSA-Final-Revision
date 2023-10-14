package priorityqueue;


import java.util.PriorityQueue;

public class Priority_QueueTest {
    public static void main(String[] args) throws PriorityQueueException {
//        Priority_Queue<String> pq = new Priority_Queue<>();
//        pq.insert("abc", 15);
//        pq.insert("def", 20);
//        pq.insert("ghi", 10);
//        pq.insert("jkl", 25);
//        pq.insert("mno", 9);

        // for min heap
//        while (!pq.isEmpty()) {
//            System.out.println(pq.getMin());
//            pq.removeMin();
//        }



        Priority_Queue<String> pq = new Priority_Queue<>();
        pq.insertMax("abc", 15);
        pq.insertMax("def", 20);
        pq.insertMax("ghi", 10);
        pq.insertMax("jkl", 25);
        pq.insertMax("mno", 9);

        System.out.println("-----------------------------------------------------");
        while (!pq.isEmpty()) {
            System.out.println(pq.getMax());
            pq.removeMax();
        }
    }
}
