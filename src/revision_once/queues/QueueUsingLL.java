package revision_once.queues;

public class QueueUsingLL<T> {
    private Node<T> rear;
    private Node<T> front;
    private int size;

    QueueUsingLL() {
        this.rear = null;
        this.front = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T elem) {
        Node<T> newNode = new Node<>(elem);
        size++;

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T front() throws QueueEmptyException {
        if (front == null) {
            throw new QueueEmptyException();
        }

        return front.data;
    }

    public T dequeue() throws QueueEmptyException {
        if (front == null) {
            throw new QueueEmptyException();
        }

        T temp = front.data;
        front = front.next;
        // now if now data is left in queue then
        if (front == null) {
            rear = null;
        }
        size--;
        return temp;
    }
}
