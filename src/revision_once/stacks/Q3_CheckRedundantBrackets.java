package revision_once.stacks;

import java.util.Stack;

public class Q3_CheckRedundantBrackets {
    public static void main(String[] args) {
        System.out.println(checkRedundantBrackets("(a)+ b - c"));
    }

    public static boolean checkRedundantBrackets(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || find(exp.charAt(i))) {
                stack.push(exp.charAt(i));
            } else if(exp.charAt(i) == ')'){
                boolean hasOperator = false;

                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    hasOperator = true;
                }

                if (!hasOperator) {
                    return true;
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        return false;
    }

    public static boolean find(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }

        return false;
    }
}
