package linkedlist.singly;

public class Node<T> {
    // This will store generic type of data
    T data;
    Node<T> next;
    Node (T data) {
        this.data = data;
        this.next = null;   // you can put it null or it is by default null itself
    }
}
