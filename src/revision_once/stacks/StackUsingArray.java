package revision_once.stacks;


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

    // method to find size
    public int size() {
        return topIndex + 1;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public void push(int elem) {
        if (topIndex == data.length - 1) {
            doubleCapacity();
        }
        data[++topIndex] = elem;
    }

    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public int pop() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        int temp = data[topIndex--];
        return temp;
    }


    public void doubleCapacity() {
        int[] temp = data;
        data = new int[temp.length * 2];
        for (int i = 0; i < data.length; i++) {
            data[i] = temp[i];
        }
    }
}
