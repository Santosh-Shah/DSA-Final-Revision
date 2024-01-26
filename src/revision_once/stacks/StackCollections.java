package revision_once.stacks;

import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hariom");
        stack.push("Radhe Shyam");
        stack.push("Santosh");

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
