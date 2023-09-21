package queue;

public class QueueUse {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        QueueUsingArray queue = new QueueUsingArray();
//        queue.enqueue(5);
//        queue.enqueue(10);
//        System.out.println(queue.front());
//        System.out.println(queue.size());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.size());
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.size());
//        System.out.println(queue.dequeue());

        int[] data = {1, 2, 3, 4, 5};
        for (int ans : data) {
            queue.enqueue(ans);
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }

        System.out.println();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());


    }
}
