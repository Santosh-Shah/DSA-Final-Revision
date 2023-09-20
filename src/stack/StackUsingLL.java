package stack;

public class StackUsingLL<T> {
    private Node<T> head;
    private Node<T> prev;
    private int count = -1;

    public StackUsingLL() {
        head = null;
    }

    public int size() {
        return count + 1;
    }

    public boolean isEmpty() {
        return count <= 0;
    }

    public void push(T data) {
        if (head == null) {
            head = new Node<>(data);
            prev = head;
        } else {
            head.next = new Node<>(data);
        }
        head = head.next;
        count++;
    }

    public Node<T> top() {
        return head;
    }

    public T pop() {

    }
}
