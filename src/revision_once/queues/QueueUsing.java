package revision_once.queues;

public class QueueUsing {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingLL queue = new QueueUsingLL();
        queue.enqueue(45);
        queue.enqueue(450);
        queue.enqueue(4500);
        queue.enqueue(45000);

        System.out.println("Size of Queue: " + queue.size());
        System.out.println("Checking Queue is Empty or Not: " + queue.isEmpty());
        System.out.println("First value of queue: " + queue.front());

        // removing data from queue
        queue.dequeue();
        System.out.println("\n----------After removing first data of queue:---------");
        System.out.println("Size of Queue: " + queue.size());
        System.out.println("Checking Queue is Empty or Not: " + queue.isEmpty());
        System.out.println("First value of queue: " + queue.front());

    }
}
