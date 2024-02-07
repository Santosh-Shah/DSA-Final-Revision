package stack;

import java.util.ArrayList;
import java.util.Stack;

public class Q4_StackSpan {
    // TODO: method to track stack span
    public static int[] stackSpan(int[] price) {
        //Your code goes here
        int[] span=new int[price.length];
        Stack<Integer> stack=new Stack<Integer>();
        span[0]=1;
        stack.push(0);

        for (int i=1;i<price.length;i++) {
            while(!stack.isEmpty() && price[stack.peek()]<price[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i]=i+1;
            } else {
                span[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }


    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
//        int[] arr = {60, 70, 80, 100, 90, 75, 80, 120};
        arr = stackSpan(arr);

        for (int ans : arr) {
            System.out.print(ans + " ");
        }
    }
}
