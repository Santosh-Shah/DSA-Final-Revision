package priorityqueue;

import java.util.ArrayList;

public class Priority_Queue<T> {
    ArrayList<Element<T>> heap;

    public Priority_Queue() {
        heap = new ArrayList<>();
    }

    public void insert(T value, int priority) {

    }

    public T getMin() throws PriorityQueueException{
        if (heap.size() == 0) {
            throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }

    public T removeMin() {

    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        if (heap.size() == 0) {
            return true;
        }
        return false;
    }
}
