package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues<T> {
    private Queue<T> q1;
    private Queue<T> q2;

    StackUsingTwoQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // method to return size of stack
    public int getSize() {
        return q1.size();
    }

    // method to check is stack empty or not
    public boolean isEmpty() {
        return q1.size() == 0;
    }

    // method to push data
    public void push(T elem) {
        q1.add(elem);
    }

    // method to pop data
    public T pop() {
//        if (this.isEmpty()) {
//            return T;
//        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        T ans = q1.poll();

        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
        return ans;
    }

    // method to return top must elements
    public T top() {
//        if (this.isEmpty()) {
//            return T;
//        }

            while (q1.size() > 1) {
                q2.add(q1.poll());
            }

            T ans = q1.poll();
            q2.add(ans);

            Queue<T> temp = q1;
            q1 = q2;
            q2 = temp;
            return ans;
    }
}
