package revision_once.stacks;

import java.util.Stack;

public class Q2_ReverseStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for (int value : arr) {
            stack.push(value);
        }

        reverseStack(stack, temp);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void reverseStack(Stack<Integer> input, Stack<Integer> temp) {
        if (input.size() <= 1) {
            return;
        }

        int lastElement = input.pop();
        reverseStack(input, temp);

        // putting all the remain elements into extra
        while (!input.isEmpty()) {
            int top = input.pop();
            temp.push(top);
        }

        // putting last element into input
        input.push(lastElement);

        // putting all element from temp into input
        while (!temp.isEmpty()) {
            int top = temp.pop();
            input.push(top);
        }
    }
}
