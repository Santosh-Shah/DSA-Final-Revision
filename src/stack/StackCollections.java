package stack;

import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {2, 3, 4, 5, 6};
        for (int ans : arr) {
            stack.push(ans);
        }

//        System.out.println(stack.peek());
//        System.out.println(stack.size());
//        System.out.println(stack.pop());
//        System.out.println(stack.size());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.isEmpty());
    }
}
