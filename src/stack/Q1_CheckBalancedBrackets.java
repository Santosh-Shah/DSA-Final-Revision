package stack;

import java.util.Stack;

public class Q1_CheckBalancedBrackets {
    // TODO: method to print balanced brackets
    public static boolean isBracketsBalanced(String expression) {
        int len = expression.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char x = expression.charAt(i);
            if (x == '{' || x == '[' || x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isBracketsBalanced(")}]"));

    }
}
