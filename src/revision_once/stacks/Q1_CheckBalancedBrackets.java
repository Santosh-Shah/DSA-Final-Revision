package revision_once.stacks;

import java.util.Stack;

public class Q1_CheckBalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBracketsBalanced("[()}]"));
    }

    public static boolean isBracketsBalanced(String brackets) {
        int len = brackets.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            char value = brackets.charAt(i);
            if (value == '{' || value == '[' || value == '(') {
                stack.push(value);
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
}
