package stack;

public class StackUsingArray {
    private int[] data;
    private int topIndex;

    public StackUsingArray() {
        data = new int[10];
        topIndex = -1;
    }

    public StackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }

    // method to check the size of stack
    public int size() {                                 // T(n) = O(1)
        return topIndex + 1;
    }

    // method to check stack is empty or not
    public boolean isEmpty() {                         // T(n) = O(1)
        return topIndex == -1;
    }

    // method to insert data
    public void push(int elem) throws StackFullException {                // T(n) = O(1)
        // if stack is full throw an exception
        if (topIndex == data.length - 1) {
//            throw new StackFullException();
//            data = new int[data.length * 2];   or do this
            doubleCapacity();
        }
        data[++topIndex] = elem;
    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    // method to show top most element of the stack
    public int top() throws StackEmptyException {                         // T(n) = O(1)
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    // method to remove top most element of the stack
    public int pop() throws StackEmptyException{               // T(n) = O(1)
        if (topIndex == -1) {
            throw new StackEmptyException();
        }

        int temp = data[topIndex--];
        return temp;
    }


}
