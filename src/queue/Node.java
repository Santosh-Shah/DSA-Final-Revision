package queue;

public class Node<T> {
    // This will store a generic type of data
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;   // you can put it null or it is by default null itself
    }
}
