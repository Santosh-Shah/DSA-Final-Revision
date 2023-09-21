package queue;

public class QueueUsingArray {

    private int[] data;
    private int front;
    private int rear;
    private int size = 0;

    QueueUsingArray() {
        data = new int[5];
        this.front = -1;
        this.rear = -1;
    }

    QueueUsingArray(int capacity) {
        data = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int elem) throws QueueFullException{
        if (size == data.length) {
            throw new QueueFullException();
        }
        if (size == 0) {
            front = 0;
        }

        data[++rear] = elem;
        size++;
    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front++;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

}
