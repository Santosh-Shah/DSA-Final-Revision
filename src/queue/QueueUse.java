package queue;

public class QueueUse {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
//        QueueUsingArray queue = new QueueUsingArray();
//        QueueUsingLL queue = new QueueUsingLL();
//        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        StackUsingTwoQueues stack = new StackUsingTwoQueues();

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

//        int[] data = {1, 2, 3, 4, 5, 6};
//        for (int ans : data) {
//            queue.enqueue(ans);
//        }

//        System.out.println(queue.size());
//        while (!queue.isEmpty()) {
//            System.out.print(queue.dequeue() + " ");
//        }
//        System.out.println(queue.size());
//        System.out.println(queue.front());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.front());
//        System.out.println(queue.size());


//        System.out.println();
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());



        int[] data = {1, 2, 3, 4};
        for (int ans : data) {
            stack.push(ans);
        }

        System.out.println(stack.getSize());
//        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.top());
//        System.out.println(stack.getSize());

    }
}
