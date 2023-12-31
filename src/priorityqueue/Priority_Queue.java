package priorityqueue;

import java.util.ArrayList;

public class Priority_Queue<T> {
    ArrayList<Element<T>> heap;

    public Priority_Queue() {
        heap = new ArrayList<>();
    }

    public void insert(T value, int priority) {
        Element<T> e = new Element<>(value, priority);
        heap.add(e);

        int childIndex = heap.size()-1;
        int parentIndex = (childIndex - 1)/2;

        // swapping children with parent
        while (childIndex > 0) {
            if (heap.get(childIndex).priority < heap.get(parentIndex).priority) {
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    public void insertMax(T value, int priority) {
        Element<T> e = new Element<>(value, priority);
        heap.add(e);

        int childIndex = heap.size()-1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (heap.get(childIndex).priority > heap.get(parentIndex).priority) {
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex,temp);

                // new childIndex and parentIndex
                childIndex = parentIndex;
                parentIndex = (childIndex - 1)/2;
            } else {
                return;
            }
        }
    }

    public T getMin() throws PriorityQueueException{
        if (heap.size() == 0) {
            throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }

//     for Max heap
    public T getMax() throws PriorityQueueException {
        if (heap.size() == 0) {
            throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }

    public T removeMin() {
        Element<T> removed = heap.get(0);

//        int lastIndex = heap.size()-1;
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        // now time do down heapify operation
        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        while (leftChildIndex < heap.size()) {
            int minIndex = parentIndex;
            if (heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = leftChildIndex;
            }

            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = rightChildIndex;
            }

            if (minIndex == parentIndex) {
                break;
            }

            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }

        return removed.value;
    }

    public T removeMax() {
        Element<T> removed = heap.get(0);

//        int lastIndex = heap.size()-1;
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        // now time do down heapify operation
        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        while (leftChildIndex < heap.size()) {
            int maxIndex = parentIndex;
            if (heap.get(leftChildIndex).priority > heap.get(maxIndex).priority) {
                maxIndex = leftChildIndex;
            }

            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority > heap.get(maxIndex).priority) {
                maxIndex = rightChildIndex;
            }

            if (maxIndex == parentIndex) {
                break;
            }

            Element<T> temp = heap.get(maxIndex);
            heap.set(maxIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex = maxIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }

        return removed.value;
    }

    public int size() {
        return heap.size();
    }

    // for max heap
    public int sizeMax() {
        return heap.size();
    }

    public boolean isEmpty() {
        if (heap.size() == 0) {
            return true;
        }
        return false;
    }
}
