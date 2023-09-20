package stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException{
        StackUsingArray stack = new StackUsingArray();
        stack.push(5);
        stack.push(10);
        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());

        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
    }
}
