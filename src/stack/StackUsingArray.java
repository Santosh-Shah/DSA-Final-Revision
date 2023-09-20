package stack;

public class StackUsingArray {
    private int[] data;
    private int topIndex;

    public StackUsingArray() {
        data = new int[10];
        topIndex = -1;
    }

    // method to check size of stack
    public int size() {
        return topIndex + 1;
    }

    // method to check stack is empty or not
    public boolean isEmpty() {
        return topIndex == -1;
    }

    // method to insert data
    public void push(int elem) throws StackFullException {
        // if stack is full throw an exception
        if (topIndex == data.length - 1) {
//            StackFullException ex = new StackFullException();
//            throw ex;
            throw new StackFullException();
        }
        data[++topIndex] = elem;
    }

    // method to show top most element of the stack
    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    // method to remove top most element of the stack
    public int pop() throws StackEmptyException{
        if (topIndex == -1) {
            throw new StackEmptyException();
        }

        int temp = data[--topIndex];
        return temp;
    }


}
