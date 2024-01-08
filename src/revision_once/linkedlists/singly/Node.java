package revision_once.linkedlists.singly;

public class Node<T> {
    T data;
    Node<T> next;

    Node (T data) {
        this.data = data;
        this.next = null;
    }
}
