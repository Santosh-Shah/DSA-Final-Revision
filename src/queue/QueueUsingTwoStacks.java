package queue;

import java.util.Stack;

public class QueueUsingTwoStacks<T> {
    Stack<T> st1;
    Stack<T> st2;

    QueueUsingTwoStacks() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    // method to return size of queue
    public int size() {
        return st1.size();
    }

    // method to check queue is empty or not
    public boolean isEmpty() {
        return st1.isEmpty();
    }

    // method to return a top element
    public T front() {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        T temp = st2.peek();

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }

        return temp;
    }

    // enqueue method
    public void enqueue(T elem) {
        st1.push(elem);
    }

    // dequeue method
    public T dequeue() {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        T temp = st2.pop();

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }

        return temp;
    }
}
