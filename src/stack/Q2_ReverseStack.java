package stack;

import java.util.Stack;

public class Q2_ReverseStack {
    // TODO: method to reverse stack
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        if (input.size() <= 1) {
            return;
        }

        int lastElem = input.pop();
        reverseStack(input, extra);

        // taking all elements of input stack and putting into extra stack
        while (!input.isEmpty()) {
            int top = input.pop();
            extra.push(top);
        }
        // last that I have putting on the top of
            input.push(lastElem);

        // now taking all elements from extra stack into input stack
        while (!extra.isEmpty()) {
            int top = extra.pop();
            input.push(top);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10};
        Stack<Integer> input = new Stack<>();
        for (int ans : arr) {
            input.push(ans);
        }
        Stack<Integer> extra = new Stack<>();
        System.out.println("Before reverse");
//        while (!input.isEmpty()) {
//            System.out.println(input.pop());
//        }
        reverseStack(input, extra);
        while (!input.isEmpty()) {
            System.out.print(input.pop() + " ");
        }


    }
}
